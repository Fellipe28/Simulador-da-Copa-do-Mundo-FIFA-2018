package Cup;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Finais implements ActionListener{
	String Stadiums[] = {"Bandeiras/Estádio Krestovsky.jpg","Bandeiras/Ciano2.png","Bandeiras/Ciano2.png","Bandeiras/Estádio Lujniki.jpg",
                         "Bandeiras/Ciano2.png","Bandeiras/Ciano2.png"};
	String C,V,T,Selecoes[] = new String[12],PS[] = new String[4];
	static String Logotipo = "C:/Users/FRANCISCA/eclipse-workspace/Copa do Mundo FIFA 2018/src/Cup/Bandeiras/Logo2018.png";
	ImageIcon BC,BV,BT,BPS[] = new ImageIcon[4];
	JScrollPane Barra;
	JTextField Placar[] = new JTextField[12];
	String path = "C:/Users/FRANCISCA/eclipse-workspace/Copa do Mundo FIFA 2018/src/Cup/";
	String Titulos[] = {"Disputa pelo terceiro lugar","Final"};
	int Total,n;
	JLabel Bandeiras[] = new JLabel[12],PR[] = new JLabel[4],DP[] = new JLabel[4],Times[] = new JLabel[12],x[] = new JLabel[6];
	Font fonte = new Font("Arial",Font.PLAIN,15),ScoreFont = new Font("Arial",Font.BOLD,15);
	int TR[][] = new int[2][2],PRO[][] = new int[2][2],PEN[][] = new int[2][2];
	int p[] = {0,1,2};
	public Finais(){
		JPanel Panel = new JPanel(new BorderLayout()),Jogos = new JPanel(new GridLayout(2,1,5,5)),Locais[] = new JPanel[6],Data[] = new JPanel[6],
		       Direita[] = new JPanel[2],finais[] = new JPanel[2],centro[] = new JPanel[2],Top[] = new JPanel[2];
		JLabel Stadium[] = new JLabel[6],Schedule[] = new JLabel[6],Date[] = new JLabel[6],City[] = new JLabel[6],labels[] = new JLabel[2],Fotos[] = new JLabel[2];
	 	ImageIcon Logo = new ImageIcon(Logotipo),Premiacao[] = new ImageIcon[2];
	 	ImageIcon StadiumIcons[] = new ImageIcon[6];
	 	String Cidades[] = {"São Petersburgo","Moscou"};
	  	String Estadios[] = {"Estádio Krestovsky","Estádio Lujniki"};
	  	String Datas[] = {"14 de junho","15 de junho"};
	  	String Horas[] = {"11:00","12:00"};
  	    String D[] = new String[12],H[] = new String[12],C[] = new String[12],E[] = new String[12];
  	    Font font = new Font("Arial",Font.PLAIN,10);
  	    int l;
        for(int t = 0; t < 2; t++){
        	 l = 1 - t;
	         TR[t][0] = 0;TR[t][1] = 0;PRO[t][0] = 0;PRO[t][1] = 0;PEN[t][0] = 0;PEN[t][1] = 0;
	         setCV();
	         setT();
	         Copa.PD.setPT(this.C,V,T);Copa.PD.setPF(BC,BV,BT);
     		 Copa.PD.Times[0].setText(Copa.PD.getPT("C"));Copa.PD.Bandeiras[0].setIcon(Copa.PD.getPF("C"));
     		 Copa.PD.Times[1].setText(Copa.PD.getPT("V"));Copa.PD.Bandeiras[1].setIcon(Copa.PD.getPF("V"));
     		 Copa.PD.Times[2].setText(Copa.PD.getPT("T"));Copa.PD.Bandeiras[2].setIcon(Copa.PD.getPF("T"));
	         Selecoes[6*t] = PS[2*t];Selecoes[6*t+1] = PS[2*t+1];
	         Selecoes[6*t] = PS[2*l];Selecoes[6*t+1] = PS[2*l+1];
	         Selecoes[6*t+2] = "Seleções";Selecoes[6*t+3] = "Seleções";
	         Selecoes[6*t+4] = "Seleções";Selecoes[6*t+5] = "Seleções";
	         Bandeiras[6*t] = new JLabel(BPS[2*l]);Bandeiras[6*t+1] = new JLabel(BPS[2*l+1]);
	         Bandeiras[6*t+2] = new JLabel("");Bandeiras[6*t+3] = new JLabel(new ImageIcon(path + "Bandeiras/Ciano1.png"));
	         Bandeiras[6*t+4] = new JLabel("");Bandeiras[6*t+5] = new JLabel(new ImageIcon(path + "Bandeiras/Ciano1.png"));
	         Bandeiras[6*t+4].setFont(fonte);Bandeiras[6*t+4].setHorizontalAlignment(JLabel.CENTER);Bandeiras[6*t+4].setForeground(Color.BLUE);
	         D[3*t] = Datas[t];D[3*t+1] = "Data";D[3*t+2] = "Data";
	         H[3*t] = Horas[t];H[3*t+1] = "Hora";H[3*t+2] = "Hora";
	         C[3*t] = Cidades[t];C[3*t+1] = "Cidade";C[3*t+2] = "Cidade";
	         E[3*t] = Estadios[t];E[3*t+1]= "Estádio";E[3*t+2]= "Estádio";
	         finais[t] = new JPanel(new BorderLayout());
	         centro[t] = new JPanel(new GridLayout(3,9,5,5));
	         Direita[t] = new JPanel(new GridLayout(3,1,5,5));
        }
        for(int i = 0; i < 6; i++){
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
    	     Direita[i/3].add(new JLabel(StadiumIcons[i]));
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
 	         centro[i/3].add(Data[i]);centro[i/3].add(Times[2*i]);centro[i/3].add(Bandeiras[2*i]);centro[i/3].add(Placar[2*i]);centro[i/3].add(x[i]);centro[i/3].add(Placar[2*i+1]);
 	         centro[i/3].add(Bandeiras[2*i+1]);centro[i/3].add(Times[2*i+1]);centro[i/3].add(Locais[i]);
        }
        Font TitleFont = new Font("Arial",Font.BOLD,25),SubFont = new Font("Arial",Font.BOLD,20);
        for(int k = 0; k < 2; k++){
        	labels[k] = new JLabel(Titulos[k]);
        	labels[k].setForeground(Color.BLUE);
        	labels[k].setFont(SubFont);
        	labels[k].setHorizontalAlignment(JLabel.CENTER);
        	centro[k].setBackground(Color.CYAN);
        	Direita[k].setBackground(Color.CYAN);
        	finais[k].setBackground(Color.CYAN);
        	Premiacao[k] = new ImageIcon(path + "Bandeiras/Ciano2.png");
        	Fotos[k] = new JLabel(Premiacao[k]);
        	Fotos[k].setBackground(Color.CYAN);
        	Top[k] = new JPanel(new FlowLayout());
        	Top[k].add(Fotos[k]);
        	Top[k].add(labels[k]);
        	Top[k].add(Fotos[k]);
        	Top[k].setBackground(Color.CYAN);
        	finais[k].add(Top[k],BorderLayout.NORTH);
        	finais[k].add(centro[k],BorderLayout.CENTER);
        	finais[k].add(Direita[k],BorderLayout.EAST);
        	Jogos.add(finais[k]);
        }
        Jogos.setBackground(Color.CYAN);
        Panel.add(Jogos,BorderLayout.CENTER);
        JLabel Titulo = new JLabel("<html><br>Copa do Mundo FIFA de 2018 - Finais<br><br></html>");
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
    public void setCV(){
    	int Diferenca = (TR[1][0] + PRO[1][0] + PEN[1][0]) - (TR[1][1] + PRO[1][1] + PEN[1][1]);
    	if(Diferenca > 0){C = PS[0].toUpperCase();BC = BPS[0];V = PS[1].toUpperCase();BV = BPS[1];}
  		else if(Diferenca < 0){C = PS[1].toUpperCase();BC = BPS[1];V = PS[0].toUpperCase();BV = BPS[0];}
  		else{
  			   C = "Vencedor da Final".toUpperCase();
  		       BC = new ImageIcon(path + "Bandeiras/Indefinido.png");
  		       V = "Perdedor da Final".toUpperCase();
  		       BV = new ImageIcon(path + "Bandeiras/Indefinido.png");
  		}
    	String CT;
    	if(TitlesNumber(C) == -1){
    		CT = " (?º título)".toLowerCase();
    	}else{
    		CT = " (" + Integer.toString(TitlesNumber(C)+1) + "º título)".toLowerCase();
    	}
    	C += CT;
    }
    public void setT(){
    	int Diferenca = (TR[0][0] + PRO[0][0] + PEN[0][0]) - (TR[0][1] + PRO[0][1] + PEN[0][1]);
  		if(Diferenca > 0){T = PS[2].toUpperCase();BT = BPS[2];}
  		else if(Diferenca < 0){T = PS[3].toUpperCase();BT = BPS[3];}
  		else{
  			   T = "Vencedor da Disputa pelo terceiro lugar".toUpperCase();
  		       BT = new ImageIcon(path + "Bandeiras/Indefinido.png");
  		}
    }
    public int TitlesNumber(String Champion){
		String Teams[] = {"Rússia","França","Portugal","Alemanha",
	                      "Sérvia","Polônia","Inglaterra","Espanha",
	                      "Bélgica","Islândia","Suíça","Croácia",
	                      "Suécia","Dinamarca","Irã","Coreia do Sul",
	                      "Japão","Arábia Saudita","Austrália","Tunísia",
	                      "Nigéria","Marrocos","Senegal","Egito",
	                      "México","Costa Rica","Panamá","Brasil",
	                      "Uruguai","Argentina","Colômbia","Peru"};
		int Titles[] = {0,1,0,4,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,5,2,2,0,0,9},Number = -1;
		for(int i = 0; i < 32; i++){
		   if(Champion.equals(Teams[i].toUpperCase())){
			   Number = Titles[i];
		   }
		}
		return Number;
	}
    public void actionPerformed(ActionEvent evt){
	    for(int i = 0; i < 2; i++){
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
													  setCV();
											     	  setT();
											     	  Copa.PD.setPT(C,V,T);Copa.PD.setPF(BC,BV,BT);
										     		  Copa.PD.Times[0].setText(Copa.PD.getPT("C"));Copa.PD.Bandeiras[0].setIcon(Copa.PD.getPF("C"));
										     		  Copa.PD.Times[1].setText(Copa.PD.getPT("V"));Copa.PD.Bandeiras[1].setIcon(Copa.PD.getPF("V"));
										     		  Copa.PD.Times[2].setText(Copa.PD.getPT("T"));Copa.PD.Bandeiras[2].setIcon(Copa.PD.getPF("T"));
												  }
			     							  };
			     						  Placar[6*n+4].addActionListener(Act2);Placar[6*n+5].addActionListener(Act2);  
			     						  }else{
	     							               Placar[6*n+4].setText("");Placar[6*n+5].setText("");
	     							               Placar[6*n+4].setEditable(false);Placar[6*n+5].setEditable(false);
	     							               x[3*n+2].setText("");Bandeiras[6*n+4].setText("");
	     							               PEN[n][0] = 0;PEN[n][1] = 0;
	     							      }
		     							  setCV();
		     				     		  setT();
		     				     		  Copa.PD.setPT(C,V,T);Copa.PD.setPF(BC,BV,BT);
		     				     		  Copa.PD.Times[0].setText(Copa.PD.getPT("C"));Copa.PD.Bandeiras[0].setIcon(Copa.PD.getPF("C"));
		     				     		  Copa.PD.Times[1].setText(Copa.PD.getPT("V"));Copa.PD.Bandeiras[1].setIcon(Copa.PD.getPF("V"));
		     				     		  Copa.PD.Times[2].setText(Copa.PD.getPT("T"));Copa.PD.Bandeiras[2].setIcon(Copa.PD.getPF("T"));
		     						  }else{
		     							 JOptionPane.showMessageDialog(null," Digite o resultado final da partida após a\nprorrogação, não apenas o da prorrogação.");
		     							 setCV();
		     				     		 setT();
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
	     		setCV();
	     		setT();
	     		Copa.PD.setPT(C,V,T);Copa.PD.setPF(BC,BV,BT);
	     		Copa.PD.Times[0].setText(Copa.PD.getPT("C"));Copa.PD.Bandeiras[0].setIcon(Copa.PD.getPF("C"));
	     		Copa.PD.Times[1].setText(Copa.PD.getPT("V"));Copa.PD.Bandeiras[1].setIcon(Copa.PD.getPF("V"));
	     		Copa.PD.Times[2].setText(Copa.PD.getPT("T"));Copa.PD.Bandeiras[2].setIcon(Copa.PD.getPF("T"));
		    }
	    }
    }
}