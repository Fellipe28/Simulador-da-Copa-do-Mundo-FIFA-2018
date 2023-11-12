package Cup;
import java.awt.*;
import javax.swing.*;
public class Participantes{
	String Selecoes[] = {"R�ssia","Fran�a","Portugal","Alemanha",
    		             "S�rvia","Pol�nia","Inglaterra","Espanha",
    		             "B�lgica","Isl�ndia","Su��a","Cro�cia",
    		             "Su�cia","Dinamarca","Ir�","Coreia do Sul",
    		             "Jap�o","Ar�bia Saudita","Austr�lia","Tun�sia",
    		             "Nig�ria","Marrocos","Senegal","Egito",
    		             "M�xico","Costa Rica","Panam�","Brasil",
    		             "Uruguai","Argentina","Col�mbia","Peru"};
     String Bandeiras[] = {"Bandeiras/R�ssia.png","Bandeiras/Fran�a.png","Bandeiras/Portugal.png","Bandeiras/Alemanha.png",
                           "Bandeiras/S�rvia.png","Bandeiras/Pol�nia.png","Bandeiras/Inglaterra.png","Bandeiras/Espanha.png",
                           "Bandeiras/B�lgica.png","Bandeiras/Isl�ndia.png","Bandeiras/Su��a.png","Bandeiras/Cro�cia.png",
                           "Bandeiras/Su�cia.png","Bandeiras/Dinamarca.png","Bandeiras/Ir�.png","Bandeiras/Coreia do Sul.png",
                           "Bandeiras/Jap�o.png","Bandeiras/Ar�bia Saudita.png","Bandeiras/Austr�lia.png","Bandeiras/Tun�sia.png",
                           "Bandeiras/Nig�ria.png","Bandeiras/Marrocos.png","Bandeiras/Senegal.png","Bandeiras/Egito.png",
                           "Bandeiras/M�xico.png","Bandeiras/Costa Rica.png","Bandeiras/Panam�.png","Bandeiras/Brasil.png",
                           "Bandeiras/Uruguai.png","Bandeiras/Argentina.png","Bandeiras/Col�mbia.png","Bandeiras/Peru.png"};
     String VagaComo[] = {"Pa�s-sede","Vencedor do grupo A","Vencedor do grupo B","Vencedor do grupo C",
    		              "Vencedor do grupo D","Vencedor do grupo E","Vencedor do grupo F","Vencedor do grupo G",
    		              "Vencedor do grupo H","Vencedor do grupo I","Vencedor da repescagem","Vencedor da repescagem",
    		              "Vencedor da repescagem","Vencedor da repescagem","Vencedor do grupo A","2� colocado do grupo A",
    		              "Vencedor do grupo B","2� colocado do grupo B","Vencedor da repescagem intercontinental","Vencedor do grupo A",
    		              "Vencedor do grupo B","Vencedor do grupo C","Vencedor do grupo D","Vencedor do grupo E",
    		              "Vencedor da quinta fase","2� colocado da quinta fase","3� colocado da quinta fase","Vencedor da fase �nica",
    		              "2� colocado da fase �nica","3� colocado da fase �nica","4� colocado da fase �nica","Vencedor da repescagem intercontinental"};
     String VagaQuando[] = {"02 de outubro de 2010","10 de outubro de 2017","10 de outubro de 2017","05 de outubro de 2017",
    		                "09 de outubro de 2017","08 de outubro de 2017","05 de outubro de 2017","06 de outubro de 2017",
    		                "03 de setembro de 2017","09 de outubro de 2017","12 de novembro de 2017","12 de novembro de 2017",
    		                "13 de novembro de 2017","14 de novembro de 2017","12 de junho de 2017","05 de setembro de 2017",
    		                "31 de agosto de 2017","05 de setembro de 2017","15 de novembro de 2017","11 de novembro de 2017",
    		                "07 de outubro de 2017","11 de novembro de 2017","10 de novembro de 2017","08 de outubro de 2017",
    		                "01 de setembro de 2017","07 de outubro de 2017","10 de outubro de 2017","29 de mar�o de 2017",
    		                "10 de outubro de 2017","10 de outubro de 2017","10 de outubro de 2017","15 de novembro de 2017"};
     String Conf[] = {"&nbsp;<font color = 'Blue'>UEFA</font><br>(13 vagas + pa�s<br>&nbsp;&nbsp;-sede)",
    		          "<font color = 'Blue'>AFC</font><br>(4 vagas + 1)","<font color = 'Blue'>CAF</font><br>(5 vagas)",
    		          "&nbsp;&nbsp;<font color = 'Blue'>CONCACAF</font><br>&nbsp;(3 vagas)",
    		          "&nbsp;<font color = 'Blue'>CONMEBOL</font><br>&nbsp;(4 vagas + 1)"};
     static String Logotipo = "C:/Users/FRANCISCA/eclipse-workspace/Copa do Mundo FIFA 2018/src/Cup/Bandeiras/Logo2018.png";
     String path = "C:/Users/FRANCISCA/eclipse-workspace/Copa do Mundo FIFA 2018/src/Cup/";
     JLabel Titulo = new JLabel("<html><br>Copa do Mundo FIFA de 2018 - Sele��es Classificadas<br><br></html>");
     JScrollPane Barra;
     JPanel Teams = new JPanel(new GridLayout(33,3,5,5)),Flags[] = new JPanel[5];
     JPanel Panel[] = new JPanel[5],Esquerda = new JPanel(new GridLayout(5,1,5,5)),Principal = new JPanel(new BorderLayout());
     JLabel Times[] = new JLabel[33],Como[] = new JLabel[33],Quando[] = new JLabel[33],Confederacao[] = new JLabel[5];
     ImageIcon Images[] = new ImageIcon[32];
     int n[] = {14,5,5,3,5},b[] = {0,15,20,25,28};
     Font fonte = new Font("Arial",Font.PLAIN,15),font = new Font("Arial",Font.BOLD,25);
     public Participantes(){
    	 Titulo.setFont(font);
    	 Titulo.setForeground(Color.BLUE);
    	 JPanel Topo = new JPanel(new FlowLayout()),LeftFlags = new JPanel(new GridLayout(32,1)),Left = new JPanel(),Right = new JPanel();
    	 JPanel Direita = new JPanel(new BorderLayout());
    	 Topo.setBackground(Color.CYAN);
    	 ImageIcon Logo = new ImageIcon(Logotipo);
    	 JLabel Cabeca = new JLabel(Logo);
    	 Topo.add(Cabeca);Topo.add(Titulo);
    	 Font TableFont = new Font("Arial",Font.PLAIN,20);
    	 String Tabela = "<html><table border = '1'><tr><th width = '100'>Confedera��o</th><th width = '150'>Sele��o</th><th width = '325'>"
    	 		       + "Modo de Qualifica��o</th><th width = '150'>Data de Qualifica��o</th></tr>",temp,fo,nt;
    	 for(int i = 0; i < 14; i++){
    		 if(i == 0){temp = "<td rowspan = '14'><center>" + Conf[0] + "</center></td>";fo = "";nt = "";}
    		 else{temp = "";fo = "<font color = 'Blue'>";nt = "</font>";}
    		 Tabela += "<tr>" + temp + "<td font color = 'Blue'>" + Selecoes[i] + "</td><td><center>" + fo + VagaComo[i] + nt + "</center>"
    		 		 + "</td><td><center>" + VagaQuando[i] + "</center></td></tr>";
    	 }
    	 for(int i = 14; i < 19; i++){
    		 if(i == 14){temp = "<td rowspan = '5'><center>" + Conf[1] + "</center></td>";}
    		 else{temp = "";}
    		 Tabela += "<tr>" + temp + "<td font color = 'Blue'>" + Selecoes[i] + "</td><td><center><font color = 'Blue'>" + VagaComo[i] +
    				   "</font></center></td><td><center>" + VagaQuando[i] + "</center></td></tr>";
    	 }
    	 for(int i = 19; i < 24; i++){
    		 if(i == 19){temp = "<td rowspan = '5'><center>" + Conf[2] + "</center></td>";}
    		 else{temp = "";}
    		 Tabela += "<tr>" + temp + "<td font color = 'Blue'>" + Selecoes[i] + "</td><td><center><font color = 'Blue'>" + VagaComo[i] +
    				   "</font></center></td><td><center>" + VagaQuando[i] + "</center></td></tr>";
    	 }
    	 for(int i = 24; i < 27; i++){
    		 if(i == 24){temp = "<td rowspan = '3'><center>" + Conf[3] + "</center></td>";}
    		 else{temp = "";}
    		 Tabela += "<tr>" + temp + "<td font color = 'Blue'>" + Selecoes[i] + "</td><td><center><font color = 'Blue'>" + VagaComo[i] +
    				 "</font></center></td><td><center>" + VagaQuando[i] + "</center></td></tr>";
    	 }
    	 for(int i = 27; i < 32; i++){
    		 if(i == 27){temp = "<td rowspan = '5'><center>" + Conf[4] + "</center></td>";}
    		 else{temp = "";}
    		 Tabela += "<tr>" + temp + "<td font color = 'Blue'>" + Selecoes[i] + "</td><td><center><font color = 'Blue'>" + VagaComo[i] +
    				   "</font></center></td><td><center>" + VagaQuando[i] + "</center></td></tr>";
    	 }
    	 for(int i = 0; i < 32; i++){
    		 Images[i] = new ImageIcon(path + Bandeiras[i]);
    		 LeftFlags.add(new JLabel(Images[i]));
    	 }
    	 LeftFlags.setBackground(Color.CYAN);
    	 Left.add(new JLabel(""));
    	 Left.setBackground(Color.CYAN);
    	 Right.add(new JLabel(""));
    	 Right.setBackground(Color.CYAN);
    	 Direita.add(Left,BorderLayout.WEST);
    	 Direita.add(LeftFlags,BorderLayout.CENTER);
    	 Direita.add(Right,BorderLayout.EAST);
    	 Tabela += "</table></html>";
    	 JLabel Table = new JLabel(Tabela);
    	 Table.setFont(TableFont);
    	 JPanel Painel = new JPanel(new BorderLayout());
    	 Painel.add(Topo,BorderLayout.NORTH);
    	 Painel.add(Table,BorderLayout.CENTER);
    	 Painel.add(Direita,BorderLayout.WEST);
    	 Painel.setBackground(Color.CYAN);
    	 Barra = new JScrollPane(Painel);
     }
     public JScrollPane getBarra(){
    	 return Barra;
     }
}