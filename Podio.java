package Cup;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
public class Podio{
	String C,V,T;
	ImageIcon BC,BV,BT;
	JScrollPane Barra;
	JPanel Window = new JPanel(new BorderLayout()),Center = new JPanel(new GridLayout(3,1)),Paises[] = new JPanel[3],White;
	JLabel East,West,North,South,Times[] = new JLabel[3],Bandeiras[] = new JLabel[3];
	JLabel Titulo = new JLabel("<html><br>Copa do Mundo FIFA de 2018 - Pódio<br><br></html>");
	static String Logotipo = "C:/Users/FRANCISCA/eclipse-workspace/Copa do Mundo FIFA 2018/src/Cup/Bandeiras/Logo2018.png";
	String path = "C:/Users/FRANCISCA/eclipse-workspace/Copa do Mundo FIFA 2018/src/Cup/";
	String Imagem = "Bandeiras/Ciano3.png",Premios[] = {"Bandeiras/Taça FIFA.png","Bandeiras/Medalha de Prata.png","Bandeiras/Medalha de Bronze.png"};
	Font fonte = new Font("Arial",Font.BOLD,20);
	public Podio(){
		ImageIcon Icone = new ImageIcon(path + Imagem),Logo = new ImageIcon(Logotipo),Prizes[] = new ImageIcon[3];
		setPT("Vencedor da Final",
			  "Perdedor da Final",
			  "Vencedor da Disputa pelo terceiro lugar");
		setPF(new ImageIcon(path + "Bandeiras/Indefinido.png"),new ImageIcon(path + "Bandeiras/Indefinido.png"),
			  new ImageIcon(path + "Bandeiras/Indefinido.png"));
		C.toUpperCase();V.toUpperCase();T.toUpperCase();
		Times[0] = new JLabel(C);Times[1] = new JLabel(V);Times[2] = new JLabel(T);
		Bandeiras[0] = new JLabel(BC);Bandeiras[1] = new JLabel(BV);Bandeiras[2] = new JLabel(BT);
		JPanel Topo = new JPanel(new FlowLayout()),Lado = new JPanel(new GridLayout(3,1)),Flags[] = new JPanel[3],Painel = new JPanel(new BorderLayout());
		LineBorder Borda = new LineBorder(Color.BLACK,3),Border = new LineBorder(Color.GRAY,1);
		JLabel Esquerda[] = new JLabel[3];
		for(int i = 0; i < 3; i++){
			Flags[i] = new JPanel(new GridLayout(1,3,5,5));
			Flags[i].add(new JLabel(Icone));
			Flags[i].add(Bandeiras[i]);
			Flags[i].add(new JLabel(Icone));
			Flags[i].setBackground(Color.CYAN);
			Times[i].setFont(fonte);
		    Times[i].setForeground(Color.BLUE);
		    Paises[i] = new JPanel(new BorderLayout());
		    Paises[i].add(Flags[i],BorderLayout.WEST);
		    Paises[i].add(Times[i],BorderLayout.CENTER);
		    Paises[i].setBackground(Color.CYAN);
		    Paises[i].setBorder(Border);
		    Prizes[i] = new ImageIcon(path + Premios[i]);
		    Esquerda[i] = new JLabel(Prizes[i]);
		    Esquerda[i].setBorder(Border);
		    Lado.add(Esquerda[i]);
		}
		Font TitleFont = new Font("Arial",Font.BOLD,25);
		Titulo.setFont(TitleFont);
        Titulo.setHorizontalAlignment(JLabel.CENTER);
        Titulo.setForeground(Color.BLUE);
		Topo.add(new JLabel(Logo));Topo.add(Titulo);
		Topo.setBackground(Color.CYAN);
		Center.add(Paises[0]);Center.add(Paises[1]);Center.add(Paises[2]);
		Center.setBackground(Color.CYAN);
		Painel.add(Center,BorderLayout.CENTER);
		Painel.add(Lado,BorderLayout.WEST);
		Painel.setBackground(Color.CYAN);
		Painel.setBorder(Borda);
		Window.add(Topo,BorderLayout.NORTH);
		Window.add(new JLabel(Icone),BorderLayout.WEST);
		Window.add(Painel);
		Window.add(new JLabel(Icone),BorderLayout.EAST);
		Window.add(new JLabel(Icone),BorderLayout.SOUTH);
		Window.setBackground(Color.CYAN);
		Barra = new JScrollPane(Window);
	
	}
	public JScrollPane getBarra(){
		return Barra;
	}
	public void setPT(String PC,String SC,String TC){
		C = PC;V = SC;T = TC;
	}
	public void setPF(ImageIcon PC,ImageIcon SC,ImageIcon TC){
		BC = PC;BV = SC;BT = TC;
	}
	public String getPT(String Text){
		if(Text == "C"){return C;}
		else if(Text == "V"){return V;}
		else if(Text == "T"){return T;}
		else{return "";}
	}
	public ImageIcon getPF(String Text){
		if(Text == "C"){return BC;}
		else if(Text == "V"){return BV;}
		else if(Text == "T"){return BT;}
		else{return new ImageIcon();}
	}
}