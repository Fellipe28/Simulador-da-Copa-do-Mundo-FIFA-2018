package Cup;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GrupoH implements ActionListener{
	static String Selecoes[] = {"Polônia","Senegal","Colômbia","Japão"};
    static String Bandeiras[] = {"Bandeiras/Polônia.png","Bandeiras/Senegal.png","Bandeiras/Colômbia.png","Bandeiras/Japão.png"};
    String Stadiums[] = {"Bandeiras/Arena Otkrytie.jpg","Bandeiras/Arena Mordovia.jpg","Bandeiras/Arena Kazan.jpg",
    		             "Bandeiras/Estádio Central.jpg","Bandeiras/Arena Volgogrado.jpg","Bandeiras/Estádio de Samara.jpg"};
    String H1,H2;
	static String Logotipo = "C:/Users/FRANCISCA/eclipse-workspace/Copa do Mundo FIFA 2018/src/Cup/Bandeiras/Logo2018.png";
    ImageIcon BH1,BH2;
    JScrollPane Barra;
    static int P[] = {0,0,0,0};
	static int J[] = {0,0,0,0};
	static int V[] = {0,0,0,0};
	static int E[] = {0,0,0,0};
	static int D[] = {0,0,0,0};
	static int GP[] = {0,0,0,0};
	static int GC[] = {0,0,0,0};
	static int SG[] = {0,0,0,0};
    static int C[] = {3,3,3,3};
    int FP[] = {-3,-6,-7,-4};
	int S[] = {8,27,16,61};
	int Start[] = {0,1,2,3};
    int partida[] = {0,1,2,3,0,2,3,1,3,0,1,2},a,b;
    static int Gols[] = {0,0,0,0,0,0,0,0,0,0,0,0};
    static int GOL[][] = new int[4][3];
    int JR[][] = new int[4][3];
	static int VR[][] = new int[4][3];
	static int ER[][] = new int[4][3];
	static int DR[][] = new int[4][3];
    JTextField Placar[] = new JTextField[12];
    static String Table;
    JLabel Classificacao;
    String path = "C:/Users/FRANCISCA/eclipse-workspace/Copa do Mundo FIFA 2018/src/Cup/";
    int Total;
    public GrupoH(){
    	JPanel Panel = new JPanel(new BorderLayout()),Jogos = new JPanel(new GridLayout(6,9,5,5)),Locais[] = new JPanel[6],Data[] = new JPanel[6],Direita = new JPanel(new GridLayout(6,1,5,5));
    	JLabel Times[] = new JLabel[12],Stadium[] = new JLabel[6],Schedule[] = new JLabel[6],Date[] = new JLabel[6],City[] = new JLabel[6],x;
    	ImageIcon Icones[] = new ImageIcon[12],Logo = new ImageIcon(Logotipo);
		ImageIcon StadiumIcons[] = new ImageIcon[6];
    	String Cidades[] = {"Moscou","Saransk","Cazã","Ecaterimburgo","Volgogrado","Samara"};
    	String Estadios[] = {"Arena Otkrytie","Arena Mordovia","Arena Kazan","Estádio Central","Arena Volgogrado","Estádio de Samara"};
    	String Datas[] = {"19 de junho","19 de junho","24 de junho","24 de junho","28 de junho","28 de junho"};
    	String Horas[] = {"12:00","09:00","15:00","12:00","11:00","11:00"};
    	Font fonte = new Font("Arial",Font.PLAIN,15),font = new Font("Arial",Font.PLAIN,10),ScoreFont = new Font("Arial",Font.BOLD,15);
    	for(int a = 0; a < 4; a++){
    		P[a] = 0;J[a] = 0;V[a] = 0;E[a] = 0;D[a] = 0;GP[a] = 0;GC[a] = 0;SG[a] = 0;
    		for(int b = 0; b < 3; b++){
    			GOL[a][b] = 0;JR[a][b] = 0;VR[a][b] = 0;ER[a][b] = 0;DR[a][b] = 0;
    		}
    	}
    	setTable(Start);
    	Copa.OF.setPS(H1,10);Copa.OF.setPS(H2,15);
		Copa.OF.setBPS(BH1,10);Copa.OF.setBPS(BH2,15);
		Copa.OF.Times[30].setText(Copa.OF.getPS(10));Copa.OF.Times[43].setText(Copa.OF.getPS(15));
		Copa.OF.Bandeiras[30].setIcon(Copa.OF.getBPS(10));Copa.OF.Bandeiras[43].setIcon(Copa.OF.getBPS(15));
    	for(int i = 0; i < 6; i++){
    		a = partida[2*i];b = partida[2*i+1];
    		Times[2*i] = new JLabel(Selecoes[a]);Times[2*i+1] = new JLabel(Selecoes[b]);
    		Icones[2*i] = new ImageIcon(getClass().getResource(Bandeiras[a]));Icones[2*i+1] = new ImageIcon(getClass().getResource(Bandeiras[b]));
    		StadiumIcons[i] = new ImageIcon(path + Stadiums[i]);
    		Placar[2*i] = new JTextField();Placar[2*i+1] = new JTextField();
    		Placar[2*i].setHorizontalAlignment(JTextField.CENTER);Placar[2*i+1].setHorizontalAlignment(JTextField.CENTER);
    		Placar[2*i].setFont(ScoreFont);Placar[2*i+1].setFont(ScoreFont);
    		Placar[2*i].addActionListener(this);Placar[2*i+1].addActionListener(this);
    		Times[2*i].setFont(fonte);Times[2*i+1].setFont(fonte);
    		Times[2*i].setForeground(Color.BLUE);Times[2*i+1].setForeground(Color.BLUE);
    		Times[2*i].setHorizontalAlignment(JLabel.RIGHT);Times[2*i+1].setHorizontalAlignment(JLabel.LEFT);
    		Date[i] = new JLabel(Datas[i]);Date[i].setFont(font);Date[i].setForeground(Color.BLUE);Date[i].setHorizontalAlignment(JLabel.CENTER);
    		Schedule[i] = new JLabel(Horas[i]);Schedule[i].setFont(font);Schedule[i].setForeground(Color.BLUE);Schedule[i].setHorizontalAlignment(JLabel.CENTER);
    		Stadium[i] = new JLabel(Estadios[i]);Stadium[i].setFont(font);Stadium[i].setForeground(Color.BLUE);Stadium[i].setHorizontalAlignment(JLabel.CENTER);
    		City[i] = new JLabel(Cidades[i]);City[i].setFont(font);City[i].setForeground(Color.BLUE);City[i].setHorizontalAlignment(JLabel.CENTER);
    		Locais[i] = new JPanel(new GridLayout(2,1));Data[i] = new JPanel(new GridLayout(2,1));
    		Locais[i].add(Stadium[i]);Locais[i].add(City[i]);
    		Locais[i].setBackground(Color.CYAN);
    		Data[i].add(Date[i]);Data[i].add(Schedule[i]);
    		Data[i].setBackground(Color.CYAN);
    		x = new JLabel("x");x.setFont(ScoreFont);x.setHorizontalAlignment(JLabel.CENTER);
    		Direita.add(new JLabel(StadiumIcons[i]));
    		Jogos.add(Data[i]);Jogos.add(Times[2*i]);Jogos.add(new JLabel(Icones[2*i]));Jogos.add(Placar[2*i]);Jogos.add(x);Jogos.add(Placar[2*i+1]);
    		Jogos.add(new JLabel(Icones[2*i+1]));Jogos.add(Times[2*i+1]);Jogos.add(Locais[i]);
    	}
    	Direita.setBackground(Color.CYAN);
    	Panel.add(Jogos,BorderLayout.CENTER);
	    Panel.add(Direita,BorderLayout.EAST);
    	Font TableFont = new Font("Arial",Font.PLAIN,25),TitleFont = new Font("Arial",Font.BOLD,25);
    	JLabel Titulo = new JLabel("<html><br>Copa do Mundo FIFA de 2018 - Grupo G<br><br></html>");
    	JLabel Cabeca = new JLabel(Logo);
    	Cabeca.setHorizontalAlignment(JLabel.CENTER);
    	Classificacao = new JLabel(Table);
    	JLabel Fuso = new JLabel("<html><br>&nbsp;&nbsp;Obs.: Todas as partidas estão no fuso horário UTC-3 (Horário de Brasília).<br>"
    			               + "&nbsp;&nbsp;Obs.2: Após digitar cada resultado, pressione enter, com o cursor nos respectivos campos de texto, "
    			               + "para atualizar a tabela de classificação.<br><br></html>");
    	Titulo.setFont(TitleFont);
    	Titulo.setHorizontalAlignment(JLabel.CENTER);
    	Titulo.setForeground(Color.BLUE);
    	Fuso.setFont(font);
    	Fuso.setHorizontalAlignment(JLabel.LEFT);
    	Fuso.setVerticalAlignment(JLabel.TOP);
    	Fuso.setForeground(Color.BLUE);
    	Classificacao.setFont(TableFont);
    	JPanel Painel = new JPanel(new GridLayout(2,1,5,5)),Tabela = new JPanel(new BorderLayout()),Topo = new JPanel(new FlowLayout());
    	Topo.add(Cabeca);
    	Topo.add(Titulo);
    	Topo.setBackground(Color.CYAN);
    	Tabela.add(Topo,BorderLayout.NORTH);
    	Tabela.add(Classificacao,BorderLayout.CENTER);
    	Tabela.add(Fuso,BorderLayout.SOUTH);
    	Tabela.setBackground(Color.CYAN);
    	Painel.add(Tabela);Painel.add(Panel);
    	Classificacao.setHorizontalAlignment(JLabel.CENTER);
    	Classificacao.setBackground(Color.CYAN);Jogos.setBackground(Color.CYAN);
    	Painel.setBackground(Color.CYAN);
    	Painel.setBackground(Color.CYAN);
    	Barra = new JScrollPane(Painel);
    }
    public static void setResult(int x,int y,int a,int b,int r,int add){
		if(x > y){
	        VR[a][r] = 1;DR[b][r] = 1;
	        ER[a][r] = 0;ER[b][r] = 0;
	        VR[b][r] = 0;DR[a][r] = 0;
	    }else if(x == y){
	        ER[a][r] = add;ER[b][r] = add;
	        VR[a][r] = 0;DR[b][r] = 0;
	        VR[b][r] = 0;DR[a][r] = 0;
	   	}else{
	   		VR[b][r] = 1;DR[a][r] = 1;
	   		ER[a][r] = 0;ER[b][r] = 0;
	   	    VR[a][r] = 0;DR[b][r] = 0;
	   	}
    }
    public String getH1(){
	    return H1;
    }
    public String getH2(){
	    return H2;
    }
    public ImageIcon getBH1(){
	    return BH1;
    }
    public ImageIcon getBH2(){
	    return BH2;
    }
    public JScrollPane getBarra(){
	    return Barra;
    }
    public int getTotal(){
    	return Total;
    }
    public void setValues(int x,int y,int k){
	    int r = k / 2;
	    try{
		    Gols[2*k] = Integer.parseInt(Placar[2*k].getText());
		    Gols[2*k+1] = Integer.parseInt(Placar[2*k+1].getText());
		    JR[x][r] = 1;JR[y][r] = 1;
		    setResult(Gols[2*k],Gols[2*k+1],x,y,r,1);
	    }catch(NumberFormatException e){
	     	Gols[2*k] = 0;
	     	Gols[2*k+1] = 0;
	     	JR[x][r] = 0;JR[y][r] = 0;
	    	setResult(Gols[2*k],Gols[2*k+1],x,y,r,0);
		    JOptionPane.showMessageDialog(null,"Placar inválido.");
	    }catch(NullPointerException e){
		    Gols[2*k] = 0;
		    Gols[2*k+1] = 0;
		    JR[x][r] = 0;JR[y][r] = 0;
		    setResult(Gols[2*k],Gols[2*k+1],x,y,r,0);
		    JOptionPane.showMessageDialog(null,"Placar inválido.");
	    }
	    GOL[x][r] = Gols[2*k];GOL[y][r] = Gols[2*k+1];
        }
    public static int Direct(int team1,int team2){
	    int rodada = 1,c;
	    if(Math.abs(team1-team2) == 1 && team1 + team2 != 3){rodada = 0;c = 1;}
	    else if(Math.abs(team1-team2) == 2) {rodada = 1;c = 1;}
	    else if(team1 + team2 == 3){rodada = 2;c = 1;}
	    else{c = 0;}
     	int gol;
	    if(c == 1){gol = GOL[team1][rodada];}
	    else{gol = 0;}
	    return gol;
    }
    public void setRanking(){
    	for(int i = 0; i < 4; i++){
    		for(int j = 0; j < 4; j++){
    			if(i != j){
    					if(P[i] > P[j]){C[i]--;}
        				else if(P[i] == P[j]){
        					if(SG[i] > SG[j]){C[i]--;}
        					else if(SG[i] == SG[j]){
        						if(GP[i] > GP[j]){C[i]--;}
        						else if(GP[i] == GP[j]){
        							if(Direct(i,j) > Direct(j,i)){C[i]--;}
        							else if(Direct(i,j) == Direct(j,i)){
        								if(FP[i] > FP[j]){C[i]--;}
        								else if(FP[i] == FP[j]){
        									if(S[i] < S[j]){C[i]--;}
        								}
        							}
        						}
        					}
        				}
    			  }
    		}
    	}
    }
    public void setTable(int k[]){
	    int R[] = new int[4];
	    for(int x = 0; x < 4; x++){
		    if(k[x] == 0){
			     R[0] = x;
		    }else if(k[x] == 1){
			     R[1] = x;
		    }else if(k[x] == 2){
			     R[2] = x;
		    }else if(k[x] == 3){
			     R[3] = x;
		    }
	    }
	    Total = J[0] + J[1] + J[2] + J[3];
	    Table = "<html><table border = '3'><tr><th width = '80'>Pos.</th><th width = '200'>Seleção</th><th width = '80'>Pts</th>"
	          + "<th width = '70'>J</th><th width = '70'>V</th><th width = '70'>E</th><th width = '70'>D</th><th width = '70'>GP</th>"
	          + "<th width = '70'>GC</th><th width = '70'>SG</th></tr>";
	    for(int n = 0; n < 4; n++){
	    	if(Total < 12){
	    		H1 = "1º do Grupo G";H2 = "2º do Grupo G";
		    	BH1 = new ImageIcon(path + "Bandeiras/Indefinido.png");BH2 = new ImageIcon(path + "Bandeiras/Indefinido.png");
    			Table += "<tr><th>" + Integer.toString(n+1) + "º</th><td font color = 'Blue'>" + Selecoes[R[n]] + "</td><th>" + P[R[n]]
    					   + "</th><td><center>" + J[R[n]] + "</center></td><td><center>" + V[R[n]] + "</center></td><td><center>" + E[R[n]]
    					   + "</center></td><td><center>" + D[R[n]] + "</center></td><td><center>" + GP[R[n]] + "</center></td><td><center>"
    					   + GC[R[n]] + "</center></td><td><center>" + SG[R[n]] + "</center></td></tr>";
    		}else if(Total == 12){
    			H1 = Selecoes[R[0]];H2 = Selecoes[R[1]];
    		    BH1 = new ImageIcon(path + "Bandeiras/" + Selecoes[R[0]] + ".png");BH2 = new ImageIcon(path + "Bandeiras/" + Selecoes[R[1]] + ".png");
    			if(n < 2){
    				Table += "<tr><th bgcolor = '#00FA9A'>" + Integer.toString(n+1) + "º</th><td font color = 'Blue' bgcolor = '#00FA9A'>"
    			           + Selecoes[R[n]] + "</td>" + "<th bgcolor = '#00FA9A'>" + P[R[n]] + "</th><td bgcolor = '#00FA9A'><center>"
    					   + J[R[n]] + "</center></td><td bgcolor = '#00FA9A'><center>" + V[R[n]] + "</center></td><td bgcolor = '#00FA9A'>"
    			           + "<center>" + E[R[n]] + "</center></td><td bgcolor = '#00FA9A'><center>" + D[R[n]] + "</center></td><td bgcolor = '#00FA9A'>"
    					   + "<center>" + GP[R[n]] + "</center></td><td bgcolor = '#00FA9A'><center>" + GC[R[n]] + "</center></td><td bgcolor = '#00FA9A'>"
    					   + "<center>"+ SG[R[n]] + "</center></td></tr>";
    			}else{
    				Table += "<tr><th bgcolor = '#FFC0CB'>" + Integer.toString(n+1) + "º</th><td font color = 'Blue' bgcolor = '#FFC0CB'>"
     			           + Selecoes[R[n]] + "</td><th bgcolor = '#FFC0CB'>" + P[R[n]] + "</th><td bgcolor = '#FFC0CB'><center>" + J[R[n]]
     			           + "</center></td><td bgcolor = '#FFC0CB'><center>" + V[R[n]] + "</center></td><td bgcolor = '#FFC0CB'><center>"
     			           + E[R[n]] + "</center></td><td bgcolor = '#FFC0CB'><center>" + D[R[n]] + "</center></td><td bgcolor = '#FFC0CB'>"
     			           + "<center>" + GP[R[n]] + "</center></td><td bgcolor = '#FFC0CB'><center>" + GC[R[n]] + "</center></td><td bgcolor = '#FFC0CB'>"
     			           + "<center>"+ SG[R[n]] + "</center></td></tr>";
    			}
    		}
	    }
	    Table += "</table></html>";
    }
    public void actionPerformed(ActionEvent evt){
	    int x,y;
	    for(int i = 0; i < 6; i++){
		    x = partida[2*i];y = partida[2*i+1];
	     	if(evt.getSource() == Placar[2*i] || evt.getSource() == Placar[2*i+1]){
		     	C[0] = 3;C[1] = 3;C[2] = 3;C[3] = 3;
			    setValues(x,y,i);
			    J[x] = JR[x][0] + JR[x][1] + JR[x][2];V[x] = VR[x][0] + VR[x][1] + VR[x][2];E[x] = ER[x][0] + ER[x][1] + ER[x][2];D[x] = DR[x][0] + DR[x][1] + DR[x][2];
			    J[y] = JR[y][0] + JR[y][1] + JR[y][2];V[y] = VR[y][0] + VR[y][1] + VR[y][2];E[y] = ER[y][0] + ER[y][1] + ER[y][2];D[y] = DR[y][0] + DR[y][1] + DR[y][2];
			    GP[x] = GOL[x][0] + GOL[x][1] + GOL[x][2];GP[y] = GOL[y][0] + GOL[y][1] + GOL[y][2];
			    GC[x] = Direct(0,x) + Direct(1,x) + Direct(2,x) + Direct(3,x);
			    GC[y] = Direct(0,y) + Direct(1,y) + Direct(2,y) + Direct(3,y);
			    P[x] = 3*V[x] + E[x];P[y] = 3*V[y] + E[y];
			    SG[x] = GP[x] - GC[x];SG[y] = GP[y] - GC[y];
			    setRanking();
			    setTable(C);
			    Classificacao.setText(Table);
			    Copa.OF.setPS(H1,10);Copa.OF.setPS(H2,15);
				Copa.OF.setBPS(BH1,10);Copa.OF.setBPS(BH2,15);
				Copa.OF.Times[30].setText(Copa.OF.getPS(10));Copa.OF.Times[43].setText(Copa.OF.getPS(15));
				Copa.OF.Bandeiras[30].setIcon(Copa.OF.getBPS(10));Copa.OF.Bandeiras[43].setIcon(Copa.OF.getBPS(15));
		    }
	    }
    }
}