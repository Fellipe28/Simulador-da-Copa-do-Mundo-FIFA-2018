package Cup;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Quartas implements ActionListener{
	String Stadiums[] = {"Bandeiras/Est�dio de N�jni Novgorod.jpg","Bandeiras/Ciano2.png","Bandeiras/Ciano2.png","Bandeiras/Arena Kazan.jpg",
                         "Bandeiras/Ciano2.png","Bandeiras/Ciano2.png","Bandeiras/Est�dio de Samara.jpg","Bandeiras/Ciano2.png","Bandeiras/Ciano2.png",
                         "Bandeiras/Est�dio Ol�mpico de Fisht.jpg","Bandeiras/Ciano2.png","Bandeiras/Ciano2.png"};
    String V[] = new String[4],Selecoes[] = new String[24],PS[] = new String[8];
    static String Logotipo = "C:/Users/FRANCISCA/eclipse-workspace/Copa do Mundo FIFA 2018/src/Cup/Bandeiras/Logo2018.png";
    ImageIcon BV[] = new ImageIcon[4],BPS[] = new ImageIcon[8];
    JScrollPane Barra;
    JTextField Placar[] = new JTextField[24];
    String path = "C:/Users/FRANCISCA/eclipse-workspace/Copa do Mundo FIFA 2018/src/Cup/";
    int Total,n;
    JLabel Bandeiras[] = new JLabel[24],PR[] = new JLabel[8],DP[] = new JLabel[8],Times[] = new JLabel[24],x[] = new JLabel[12];
    Font fonte = new Font("Arial",Font.PLAIN,15),ScoreFont = new Font("Arial",Font.BOLD,15);
    int TR[][] = new int[4][2],PRO[][] = new int[4][2],PEN[][] = new int[4][2];
	int p[] = {0,1,2,3},s[] = {0,1,6,7};
    public Quartas(){
    	JPanel Panel = new JPanel(new BorderLayout()),Jogos = new JPanel(new GridLayout(12,9,5,5)),Locais[] = new JPanel[12],Data[] = new JPanel[12],
			           Direita = new JPanel(new GridLayout(12,1,5,5));
	    JLabel Stadium[] = new JLabel[12],Schedule[] = new JLabel[12],Date[] = new JLabel[12],City[] = new JLabel[12];
	    ImageIcon Logo = new ImageIcon(Logotipo);
	    ImageIcon StadiumIcons[] = new ImageIcon[12];
	    String Cidades[] = {"N�jni Novgorod","Caz�","Samara","S�chi"};
	    String Estadios[] = {"Est. N�jni Novgorod","Arena Kazan","Est�dio de Samara","Est. Ol�m. de Fisht"};
	    String Datas[] = {"06 de junho","06 de junho","07 de julho","07 de julho"};
	    String Horas[] = {"11:00","15:00","11:00","15:00"};
	    String D[] = new String[12],H[] = new String[12],C[] = new String[12],E[] = new String[12];
	    Font font = new Font("Arial",Font.PLAIN,10);
	    for(int t = 0; t < 4; t++){
	    	 TR[t][0] = 0;TR[t][1] = 0;PRO[t][0] = 0;PRO[t][1] = 0;PEN[t][0] = 0;PEN[t][1] = 0;
		     setV(t);
		     Copa.SF.setPS(V[t],p[t]);Copa.SF.setBPS(BV[t],p[t]);
	     	 Copa.SF.Times[s[t]].setText(Copa.SF.getPS(p[t]));Copa.SF.Bandeiras[s[t]].setIcon(Copa.SF.getBPS(p[t]));
		     Selecoes[6*t] = PS[2*t];Selecoes[6*t+1] = PS[2*t+1];
		     Selecoes[6*t+2] = "Sele��es";Selecoes[6*t+3] = "Sele��es";
		     Selecoes[6*t+4] = "Sele��es";Selecoes[6*t+5] = "Sele��es";
		     Bandeiras[6*t] = new JLabel(BPS[2*t]);Bandeiras[6*t+1] = new JLabel(BPS[2*t+1]);
		     Bandeiras[6*t+2] = new JLabel("");Bandeiras[6*t+3] = new JLabel(new ImageIcon(path + "Bandeiras/Ciano1.png"));
		     Bandeiras[6*t+4] = new JLabel("");Bandeiras[6*t+5] = new JLabel(new ImageIcon(path + "Bandeiras/Ciano1.png"));
		     Bandeiras[6*t+4].setFont(fonte);Bandeiras[6*t+4].setHorizontalAlignment(JLabel.CENTER);Bandeiras[6*t+4].setForeground(Color.BLUE);
		     D[3*t] = Datas[t];D[3*t+1] = "Data";D[3*t+2] = "Data";
		     H[3*t] = Horas[t];H[3*t+1] = "Hora";H[3*t+2] = "Hora";
		     C[3*t] = Cidades[t];C[3*t+1] = "Cidade";C[3*t+2] = "Cidade";
		     E[3*t] = Estadios[t];E[3*t+1]= "Est�dio";E[3*t+2]= "Est�dio";
	    }
	    for(int i = 0; i < 12; i++){
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
	    JLabel Titulo = new JLabel("<html><br>Copa do Mundo FIFA de 2018 - Quartas de Final<br><br></html>");
	    JLabel Cabeca = new JLabel(Logo),Space = new JLabel("\n");
	    Cabeca.setHorizontalAlignment(JLabel.CENTER);
	    JLabel Fuso = new JLabel("<html><br>&nbsp;&nbsp;Obs.: Todas as partidas est�o no fuso hor�rio UTC-3 (Hor�rio de Bras�lia).<br>"
			                   + "&nbsp;&nbsp;Obs.2: Ap�s digitar cada resultado, pressione enter, com o cursor nos respectivos campos de texto, "
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
  			 V[i] = "<html>Vencedor de<br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;QF" + Integer.toString(i+1) + "</html>";
  		     BV[i] = new ImageIcon(path + "Bandeiras/Indefinido.png");
  		    }
    }
    public void actionPerformed(ActionEvent evt){
	    for(int i = 0; i < 4; i++){
	     	if(evt.getSource() == Placar[6*i] || evt.getSource() == Placar[6*i+1]){
	     		try{
	     			 TR[i][0] = Integer.parseInt(Placar[6*i].getText());TR[i][1] = Integer.parseInt(Placar[6*i+1].getText());n = i;
	     			 if(TR[i][0] == TR[i][1]){
	     				 Placar[6*i+2].setEditable(true);Placar[6*i+3].setEditable(true);
	     				 x[3*i+1].setText("x");x[3*i+1].setFont(ScoreFont);x[3*i+1].setHorizontalAlignment(JLabel.CENTER);
	     				 Bandeiras[6*i+2].setText("<html>&nbsp;&nbsp;&nbsp;&nbsp;Ap�s a<br>prorroga��o</html>");
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
			     		     				 Bandeiras[6*n+4].setText("<html>&nbsp;&nbsp;Disputa<br>de p�naltis</html>");
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
					    	     						  JOptionPane.showMessageDialog(null,"Placar inv�lido.");
					    	     						  PEN[n][0] = 0;PEN[n][1] = 0;
					    	     					  }catch(NumberFormatException e){
					    	     						  JOptionPane.showMessageDialog(null,"Placar inv�lido.");
					    	     						  PEN[n][0] = 0;PEN[n][1] = 0;
					    	     					  }
													  setV(n);
													  Copa.SF.setPS(V[n],p[n]);Copa.SF.setBPS(BV[n],p[n]);
												      Copa.SF.Times[s[n]].setText(Copa.SF.getPS(p[n]));Copa.SF.Bandeiras[s[n]].setIcon(Copa.SF.getBPS(p[n]));
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
		     							  Copa.SF.setPS(V[n],p[n]);Copa.SF.setBPS(BV[n],p[n]);
		     					     	  Copa.SF.Times[s[n]].setText(Copa.SF.getPS(p[n]));Copa.SF.Bandeiras[s[n]].setIcon(Copa.SF.getBPS(p[n]));
		     						  }else{
		     							 JOptionPane.showMessageDialog(null," Digite o resultado final da partida ap�s a\nprorroga��o, n�o apenas o da prorroga��o.");
		     							 setV(n);
		     						  } 
		     					 }catch(NullPointerException e){
		     						  JOptionPane.showMessageDialog(null,"Placar inv�lido.");
		     						  PRO[n][0] = 0;PRO[n][1] = 0;
		     					 }catch(NumberFormatException e){
		     						  JOptionPane.showMessageDialog(null,"Placar inv�lido.");
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
	     			 JOptionPane.showMessageDialog(null,"Placar inv�lido.");
	     			 TR[i][0] = 0;TR[i][1] = 0;
	     		}catch(NumberFormatException e){
	     			 JOptionPane.showMessageDialog(null,"Placar inv�lido.");
	     		   	 TR[i][0] = 0;TR[i][1] = 0;
	     		}
	     		setV(i);
	     		Copa.SF.setPS(V[i],p[i]);Copa.SF.setBPS(BV[i],p[i]);
		     	Copa.SF.Times[s[i]].setText(Copa.SF.getPS(p[i]));Copa.SF.Bandeiras[s[i]].setIcon(Copa.SF.getBPS(p[i]));
		    }
	    }
    }
}