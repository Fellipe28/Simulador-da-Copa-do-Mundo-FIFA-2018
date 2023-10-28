package Cup;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Oitavas implements ActionListener{
	String Stadiums[] = {"Bandeiras/Estádio Olímpico de Fisht.jpg","Bandeiras/Ciano2.png","Bandeiras/Ciano2.png","Bandeiras/Arena Kazan.jpg",
			             "Bandeiras/Ciano2.png","Bandeiras/Ciano2.png","Bandeiras/Estádio Lujniki.jpg","Bandeiras/Ciano2.png","Bandeiras/Ciano2.png",
                         "Bandeiras/Estádio de Níjni Novgorod.jpg","Bandeiras/Ciano2.png","Bandeiras/Ciano2.png","Bandeiras/Estádio de Samara.jpg",
                         "Bandeiras/Ciano2.png","Bandeiras/Ciano2.png","Bandeiras/Arena Rostov.jpg","Bandeiras/Ciano2.png","Bandeiras/Ciano2.png",
                         "Bandeiras/Estádio Krestovsky.jpg","Bandeiras/Ciano2.png","Bandeiras/Ciano2.png","Bandeiras/Arena Otkrytie.jpg","Bandeiras/Ciano2.png","Bandeiras/Ciano2.png",};
    String V[] = new String[8],Selecoes[] = new String[48],PS[] = new String[16];
    static String Logotipo = "C:/Users/FRANCISCA/eclipse-workspace/Copa do Mundo FIFA 2018/src/Cup/Bandeiras/Logo2018.png";
    ImageIcon BV[] = new ImageIcon[8],BPS[] = new ImageIcon[16];
    JScrollPane Barra;
    JTextField Placar[] = new JTextField[48];
    String path = "C:/Users/FRANCISCA/eclipse-workspace/Copa do Mundo FIFA 2018/src/Cup/";
    int Total,n;
    JLabel Bandeiras[] = new JLabel[48],PR[] = new JLabel[16],DP[] = new JLabel[16],Times[] = new JLabel[48],x[] = new JLabel[24];
    Font fonte = new Font("Arial",Font.PLAIN,15),ScoreFont = new Font("Arial",Font.BOLD,15);
    int TR[][] = new int[8][2],PRO[][] = new int[8][2],PEN[][] = new int[8][2];
	int p[] = {0,1,6,7,2,3,4,5},s[] = {0,1,18,19,6,7,12,13};
    public Oitavas(){
    	JPanel Panel = new JPanel(new BorderLayout()),Jogos = new JPanel(new GridLayout(24,9,5,5)),Locais[] = new JPanel[24],Data[] = new JPanel[24],
    			       Direita = new JPanel(new GridLayout(24,1,5,5));
    	JLabel Stadium[] = new JLabel[24],Schedule[] = new JLabel[24],Date[] = new JLabel[24],City[] = new JLabel[24];
    	ImageIcon Logo = new ImageIcon(Logotipo);
		ImageIcon StadiumIcons[] = new ImageIcon[24];
    	String Cidades[] = {"Sóchi","Cazã","Moscou","Níjni Novgorod","Samara","Rostov do Don","São Petersburgo","Moscou"};
    	String Estadios[] = {"Est. Olím. de Fisht","Arena Kazan","Estádio Lujniki","Est. Níjni Novgorod","Estádio de Samara","Arena Rostov","Estádio Krestovsky","Arena Otkrytie"};
    	String Datas[] = {"30 de junho","30 de junho","01 de julho","01 de julho","02 de julho","02 de julho","03 de julho","03 de julho"};
    	String Horas[] = {"15:00","11:00","11:00","15:00","11:00","15:00","11:00","15:00"};
    	String D[] = new String[24],H[] = new String[24],C[] = new String[24],E[] = new String[24];
    	Font font = new Font("Arial",Font.PLAIN,10);
    	for(int t = 0; t < 8; t++){
    		TR[t][0] = 0;TR[t][1] = 0;PRO[t][0] = 0;PRO[t][1] = 0;PEN[t][0] = 0;PEN[t][1] = 0;
    		setV(t);
    		Copa.QF.setPS(V[t],p[t]);Copa.QF.setBPS(BV[t],p[t]);
     		Copa.QF.Times[s[t]].setText(Copa.QF.getPS(p[t]));Copa.QF.Bandeiras[s[t]].setIcon(Copa.QF.getBPS(p[t]));
    		Selecoes[6*t] = PS[2*t];Selecoes[6*t+1] = PS[2*t+1];
    		Selecoes[6*t+2] = "Seleções";Selecoes[6*t+3] = "Seleções";
    		Selecoes[6*t+4] = "Seleções";Selecoes[6*t+5] = "Seleções";
    		Bandeiras[6*t] = new JLabel(BPS[2*t]);Bandeiras[6*t+1] = new JLabel(BPS[2*t+1]);
    		Bandeiras[6*t+2] = new JLabel("");Bandeiras[6*t+3] = new JLabel(new ImageIcon(path + "Bandeiras/Ciano1.png"));
    		Bandeiras[6*t+4] = new JLabel("");Bandeiras[6*t+5] = new JLabel(new ImageIcon(path + "Bandeiras/Ciano1.png"));
    		Bandeiras[6*t+4].setFont(fonte);Bandeiras[6*t+4].setHorizontalAlignment(JLabel.CENTER);Bandeiras[6*t+4].setForeground(Color.BLUE);
    		D[3*t] = Datas[t];D[3*t+1] = "Data";D[3*t+2] = "Data";
    		H[3*t] = Horas[t];H[3*t+1] = "Hora";H[3*t+2] = "Hora";
    		C[3*t] = Cidades[t];C[3*t+1] = "Cidade";C[3*t+2] = "Cidade";
    		E[3*t] = Estadios[t];E[3*t+1]= "Estádio";E[3*t+2]= "Estádio";
    	}
    	for(int i = 0; i < 24; i++){
    		Times[2*i] = new JLabel(Selecoes[2*i]);Times[2*i+1] = new JLabel(Selecoes[2*i+1]);
    		Times[2*i].setFont(fonte);Times[2*i+1].setFont(fonte);
    		Times[2*i].setHorizontalAlignment(JLabel.RIGHT);Times[2*i+1].setHorizontalAlignment(JLabel.LEFT);
    		StadiumIcons[i] = new ImageIcon(path + Stadiums[i]);
    		Placar[2*i] = new JTextField();Placar[2*i+1] = new JTextField();
    		Placar[2*i].setHorizontalAlignment(JTextField.CENTER);Placar[2*i+1].setHorizontalAlignment(JTextField.CENTER);
    		Placar[2*i].setFont(ScoreFont);Placar[2*i+1].setFont(ScoreFont);
    		Date[i] = new JLabel(D[i]);Date[i].setFont(font);Date[i].setHorizontalAlignment(JLabel.CENTER);
    		Schedule[i] = new JLabel(H[i]);Schedule[i].setFont(font);Schedule[i].setHorizontalAlignment(JLabel.CENTER);
    		Stadium[i] = new JLabel(E[i]);Stadium[i].setFont(font);Stadium[i].setHorizontalAlignment(JLabel.CENTER);
    		City[i] = new JLabel(C[i]);City[i].setFont(font);City[i].setHorizontalAlignment(JLabel.CENTER);
    		Direita.add(new JLabel(StadiumIcons[i]));
    		if(i % 3 == 0){
    			Times[2*i].setForeground(Color.BLUE);Times[2*i+1].setForeground(Color.BLUE);
    			Date[i].setForeground(Color.BLUE);Schedule[i].setForeground(Color.BLUE);
    			Stadium[i].setForeground(Color.BLUE);City[i].setForeground(Color.BLUE);
    			Placar[2*i].addActionListener(this);Placar[2*i+1].addActionListener(this);
    			x[i] = new JLabel("x");x[i].setFont(ScoreFont);x[i].setHorizontalAlignment(JLabel.CENTER);
    		}else{
    			Placar[2*i].setEditable(false);Placar[2*i+1].setEditable(false);
    			Times[2*i].setForeground(Color.CYAN);Times[2*i+1].setForeground(Color.CYAN);
    			Date[i].setForeground(Color.CYAN);Schedule[i].setForeground(Color.CYAN);
    			Stadium[i].setForeground(Color.CYAN);City[i].setForeground(Color.CYAN);
    			x[i] = new JLabel("");
    		}
    		Locais[i] = new JPanel(new GridLayout(2,1));Data[i] = new JPanel(new GridLayout(2,1));
    		Locais[i].add(Stadium[i]);Locais[i].add(City[i]);
    		Locais[i].setBackground(Color.CYAN);
    		Data[i].add(Date[i]);Data[i].add(Schedule[i]);
    		Data[i].setBackground(Color.CYAN);
    		Jogos.add(Data[i]);Jogos.add(Times[2*i]);Jogos.add(Bandeiras[2*i]);Jogos.add(Placar[2*i]);Jogos.add(x[i]);Jogos.add(Placar[2*i+1]);
    		Jogos.add(Bandeiras[2*i+1]);Jogos.add(Times[2*i+1]);Jogos.add(Locais[i]);
    	}
    	Jogos.setBackground(Color.CYAN);
    	Direita.setBackground(Color.CYAN);
    	Panel.add(Jogos,BorderLayout.CENTER);
	    Panel.add(Direita,BorderLayout.EAST);
    	Font TitleFont = new Font("Arial",Font.BOLD,25);
    	JLabel Titulo = new JLabel("<html><br>Copa do Mundo FIFA de 2018 - Oitavas de Final<br><br></html>");
    	JLabel Cabeca = new JLabel(Logo),Space = new JLabel("\n");
    	Cabeca.setHorizontalAlignment(JLabel.CENTER);
    	JLabel Fuso = new JLabel("<html><br>&nbsp;&nbsp;Obs.: Todas as partidas estão no fuso horário UTC-3 (Horário de Brasília).<br>"
    			               + "&nbsp;&nbsp;Obs.2: Após digitar cada resultado, pressione enter, com o cursor nos respectivos campos de texto, "
    			               + "para atualizar a lista dos vencedores.<br><br></html>");
    	Titulo.setFont(TitleFont);
    	Titulo.setHorizontalAlignment(JLabel.CENTER);
    	Titulo.setForeground(Color.BLUE);
    	Fuso.setFont(font);
    	Fuso.setHorizontalAlignment(JLabel.LEFT);
    	Fuso.setVerticalAlignment(JLabel.TOP);
    	Fuso.setForeground(Color.BLUE);
    	JPanel Painel = new JPanel(new BorderLayout()),Topo = new JPanel(new FlowLayout()),Superior = new JPanel(new BorderLayout());
    	Topo.add(Cabeca);
    	Topo.add(Titulo);
    	Topo.setBackground(Color.CYAN);
    	Superior.add(Topo,BorderLayout.NORTH);
    	Superior.add(Fuso,BorderLayout.CENTER);
    	Superior.setBackground(Color.CYAN);
    	Painel.add(Superior,BorderLayout.NORTH);Painel.add(Panel,BorderLayout.CENTER);Painel.add(Space,BorderLayout.SOUTH);
    	Painel.setBackground(Color.CYAN);
    	Painel.setBackground(Color.CYAN);
    	Barra = new JScrollPane(Painel);
    }
    public JScrollPane getBarra(){
	    return Barra;
    }
    public int getTotal(){
    	return Total;
    }
    public String getPS(int i){
    	return PS[i];
    }
    public ImageIcon getBPS(int i){
    	return BPS[i];
    }
    public void setPS(String Text,int i){
    	PS[i] = Text;
    }
    public void setBPS(ImageIcon Image,int i){
    	BPS[i] = Image;
    }
    public void setV(int i){
    	int Diferenca = (TR[i][0] + PRO[i][0] + PEN[i][0]) - (TR[i][1] + PRO[i][1] + PEN[i][1]);
  		if(Diferenca > 0){V[i] = PS[2*i];BV[i] = BPS[2*i];}
  		else if(Diferenca < 0){V[i] = PS[2*i+1];BV[i] = BPS[2*i+1];}
  		else{
  			 V[i] = "<html>Vencedor de<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;OF" + Integer.toString(i+1) + "</html>";
  		     BV[i] = new ImageIcon(path + "Bandeiras/Indefinido.png");
  		    }
    }
    public void actionPerformed(ActionEvent evt){
	    for(int i = 0; i < 8; i++){
	     	if(evt.getSource() == Placar[6*i] || evt.getSource() == Placar[6*i+1]){
	     		try{
	     			 TR[i][0] = Integer.parseInt(Placar[6*i].getText());TR[i][1] = Integer.parseInt(Placar[6*i+1].getText());n = i;
	     			 if(TR[i][0] == TR[i][1]){
	     				 Placar[6*i+2].setEditable(true);Placar[6*i+3].setEditable(true);
	     				 x[3*i+1].setText("x");x[3*i+1].setFont(ScoreFont);x[3*i+1].setHorizontalAlignment(JLabel.CENTER);
	     				 Bandeiras[6*i+2].setText("<html>&nbsp;&nbsp;&nbsp;&nbsp;Após a<br>prorrogação</html>");
	     				 Bandeiras[6*i+2].setFont(fonte);Bandeiras[6*i+2].setHorizontalAlignment(JLabel.CENTER);
	     				 Bandeiras[6*i+2].setForeground(Color.BLUE);
	     				 ActionListener Act1 = new ActionListener(){
							public void actionPerformed(ActionEvent arg0){
								try{
		     						  PRO[n][0] = Integer.parseInt(Placar[6*n+2].getText());PRO[n][1] = Integer.parseInt(Placar[6*n+3].getText());
		     						  if(PRO[n][0] >= TR[n][0] && PRO[n][1] >= TR[n][1]){
		     							 if(PRO[n][0] == PRO[n][1]){
			     							 Placar[6*n+4].setEditable(true);Placar[6*n+5].setEditable(true);
			     							 x[3*n+2].setText("x");x[3*n+2].setFont(ScoreFont);x[3*n+2].setHorizontalAlignment(JLabel.CENTER);
			     		     				 Bandeiras[6*n+4].setText("<html>&nbsp;&nbsp;Disputa<br>de pênaltis</html>");
			     		     				 Bandeiras[6*n+4].setFont(fonte);Bandeiras[6*n+4].setHorizontalAlignment(JLabel.CENTER);
			     		     				 Bandeiras[6*n+4].setForeground(Color.BLUE);
			     							  ActionListener Act2 = new ActionListener(){
												public void actionPerformed(ActionEvent arg0){
													  try{
					     								  PEN[n][0] = Integer.parseInt(Placar[6*n+4].getText());PEN[n][1] = Integer.parseInt(Placar[6*n+5].getText());
					     								  if(PEN[n][0] == PEN[n][1]){
					     									 JOptionPane.showMessageDialog(null,"Defina um vencedor.");
					     								  }
					     							  }catch(NullPointerException e){
					    	     						  JOptionPane.showMessageDialog(null,"Placar inválido.");
					    	     						  PEN[n][0] = 0;PEN[n][1] = 0;
					    	     					  }catch(NumberFormatException e){
					    	     						  JOptionPane.showMessageDialog(null,"Placar inválido.");
					    	     						  PEN[n][0] = 0;PEN[n][1] = 0;
					    	     					  }
													  setV(n);
													  Copa.QF.setPS(V[n],p[n]);Copa.QF.setBPS(BV[n],p[n]);
											     	  Copa.QF.Times[s[n]].setText(Copa.QF.getPS(p[n]));Copa.QF.Bandeiras[s[n]].setIcon(Copa.QF.getBPS(p[n]));
												  }
			     							  };
			     						  Placar[6*n+4].addActionListener(Act2);Placar[6*n+5].addActionListener(Act2);  
			     						  }else{
			     							      Placar[6*n+4].setText("");Placar[6*n+5].setText("");
			     							      Placar[6*n+4].setEditable(false);Placar[6*n+5].setEditable(false);
			     							      x[3*n+2].setText("");Bandeiras[6*n+4].setText("");
			     							      PEN[n][0] = 0;PEN[n][1] = 0;
			     						  }
		     							  setV(n);
		     						      Copa.QF.setPS(V[n],p[n]);Copa.QF.setBPS(BV[n],p[n]);
								     	  Copa.QF.Times[s[n]].setText(Copa.QF.getPS(p[n]));Copa.QF.Bandeiras[s[n]].setIcon(Copa.QF.getBPS(p[n]));
		     						  }else{
		     							 JOptionPane.showMessageDialog(null," Digite o resultado final da partida após a\nprorrogação, não apenas o da prorrogação.");
		     							 setV(n);
		     						  } 
		     					 }catch(NullPointerException e){
		     						  JOptionPane.showMessageDialog(null,"Placar inválido.");
		     						  PRO[n][0] = 0;PRO[n][1] = 0;
		     					 }catch(NumberFormatException e){
		     						  JOptionPane.showMessageDialog(null,"Placar inválido.");
		     						  PRO[n][0] = 0;PRO[n][1] = 0;
		     					 }
							}
	     				 };
	     				 Placar[6*i+2].addActionListener(Act1);Placar[6*i+3].addActionListener(Act1);
                     }else{
                    	   Placar[6*i+2].setText("");Placar[6*i+3].setText("");
                    	   Placar[6*i+2].setEditable(false);Placar[6*i+3].setEditable(false);
                           Placar[6*i+4].setEditable(false);Placar[6*i+5].setEditable(false);
                           x[3*i+1].setText("");x[3*i+2].setText("");Bandeiras[6*i+2].setText("");Bandeiras[6*i+4].setText("");
                           PRO[i][0] = 0;PRO[i][1] = 0;PEN[i][0] = 0;PEN[i][1] = 0;
                     }
	     		}catch(NullPointerException e){
	     			 JOptionPane.showMessageDialog(null,"Placar inválido.");
	     			 TR[i][0] = 0;TR[i][1] = 0;
	     		}catch(NumberFormatException e){
	     			 JOptionPane.showMessageDialog(null,"Placar inválido.");
	     		   	 TR[i][0] = 0;TR[i][1] = 0;
	     		}
	     		setV(i);
	     		Copa.QF.setPS(V[i],p[i]);Copa.QF.setBPS(BV[i],p[i]);
	     		Copa.QF.Times[s[i]].setText(Copa.QF.getPS(p[i]));Copa.QF.Bandeiras[s[i]].setIcon(Copa.QF.getBPS(p[i]));
		    }
	    }
    }
}