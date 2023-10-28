package Cup;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Copa extends JFrame implements ActionListener{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int k;
	JButton Button[] = new JButton[14];
	JPanel Cards = new JPanel();
	protected static JPanel Card[] = new JPanel[14];
	String Items[] = {"<html>&nbsp;&nbsp;&nbsp;&nbsp;Seleções<br>Classificadas</html>",
			          "Grupo A","Grupo B","Grupo C","Grupo D",
                      "Grupo E","Grupo F","Grupo G","Grupo H",
                      "Oitavas de Final","Quartas de Final",
                      "Semifinais","Finais","Pódio"};
	JMenuBar MenuBar = new JMenuBar();
	JMenu Menu = new JMenu("Opções");
    JMenuItem Novo = new JMenuItem("Nova simulação");
    JMenuItem Sair = new JMenuItem("Sair do programa");
    protected static Podio PD = new Podio();
    protected static Finais FF = new Finais();
    protected static Semifinais SF = new Semifinais();
    protected static Quartas QF = new Quartas();
    protected static Oitavas OF = new Oitavas();
    protected JScrollPane Bar[] = new JScrollPane[14];
	public Copa(){
	    super("Copa do Mundo FIFA Rússia 2018");
	    JPanel Botoes = new JPanel(new GridLayout(14,1,5,5));
	    Menu.add(Novo);Menu.add(Sair);
	    Novo.addActionListener(this);Sair.addActionListener(this);
	    MenuBar.add(Menu);
	    setJMenuBar(MenuBar);
	    this.addWindowListener(new WindowListener(){
			public void windowActivated(WindowEvent arg0){}
			public void windowClosed(WindowEvent arg0){}
			public void windowClosing(WindowEvent arg0){
				String Title = "Saída do programa";
				FrameExit(Title);
			}
			public void windowDeactivated(WindowEvent arg0){}
			public void windowDeiconified(WindowEvent arg0){}
			public void windowIconified(WindowEvent arg0){}
			public void windowOpened(WindowEvent arg0){}
	    });
	    Cards.setLayout(new CardLayout());
	    for(int i = 0; i < 14; i++) {
	    	Card[i] = new JPanel(new BorderLayout());
	    	if(i == 0){
	    		Participantes PAR = new Participantes();
	    		Bar[i] = PAR.getBarra();
	    		Card[i].add(Bar[i]);
	    	}else if(i == 1){
	    		GrupoA GRA = new GrupoA();
	    		Bar[i] = GRA.getBarra();
	    		Card[i].add(Bar[i]);
	    	}else if(i == 2){
	    		GrupoB GRB = new GrupoB();
	    		Bar[i] = GRB.getBarra();
	    		Card[i].add(Bar[i]);
	    	}else if(i == 3){
	    		GrupoC GRC = new GrupoC();
	    		Bar[i] = GRC.getBarra();
	    		Card[i].add(Bar[i]);
	    	}else if(i == 4){
	    		GrupoD GRD = new GrupoD();
	    		Bar[i] = GRD.getBarra();
	    		Card[i].add(Bar[i]);
	    	}else if(i == 5){
	    		GrupoE GRE = new GrupoE();
	    		Bar[i] = GRE.getBarra();
	    		Card[i].add(Bar[i]);
	    	}else if(i == 6) {
	    		GrupoF GRF = new GrupoF();
	    		Bar[i] = GRF.getBarra();
	    		Card[i].add(Bar[i]);
	    	}else if(i == 7){
	    		GrupoG GRG = new GrupoG();
	    		Bar[i] = GRG.getBarra();
	    		Card[i].add(Bar[i]);
	    	}else if(i == 8){
	    		GrupoH GRH = new GrupoH();
	    		Bar[i] = GRH.getBarra();
	    		Card[i].add(Bar[i]);
	    	}else if(i == 9){
	    		Bar[i] = OF.getBarra();
	    		Card[i].add(Bar[i]);
	    	}else if(i == 10){
	    		Bar[i] = QF.getBarra();
	    		Card[i].add(Bar[i]);
	    	}else if(i == 11){
	    		Bar[i] = SF.getBarra();
	    		Card[i].add(Bar[i]);
	    	}else if(i == 12){
	    		Bar[i] = FF.getBarra();
	    		Card[i].add(Bar[i]);
	    	}else{
	    		Bar[i] = PD.getBarra();
		    	Card[i].add(Bar[i]);
	    	}
	    	Card[i].setVisible(true);
	    	Button[i] = new JButton(Items[i]);
	    	Button[i].setBackground(Color.LIGHT_GRAY);
	    	Button[i].setForeground(Color.BLUE);
	    	Botoes.add(Button[i]);
	    	Cards.add(Card[i],Items[i]);
	        k = i;
	    	Button[i].addActionListener(this);
	    }
	    Button[0].setBackground(Color.CYAN);
	    Botoes.setBackground(Color.CYAN);
	    JPanel South = new JPanel();
	    South.setBackground(Color.CYAN);
	    setLayout(new BorderLayout());
	    add(Botoes,BorderLayout.WEST);
	    add(Cards,BorderLayout.CENTER);
	    add(South,BorderLayout.SOUTH);
	    setVisible(true);
		setSize(1150,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
	}
	public static void main(String[] args){
		new Copa();
	}
	public int FrameExit(String Title){
		Object options[] = {"Sim","Não"};
		int Answer = JOptionPane.showOptionDialog(null,"Tem certeza disso?",Title,
				                                  JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
				                                  null,options,options[0]);
		if(Answer == JOptionPane.YES_OPTION){
			dispose();
		}else{
			setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		}
		return Answer;
	}
	public void actionPerformed(ActionEvent event){
		for(int h = 0; h < 14; h++){
			if(event.getSource() == Button[h]){
				CardLayout cl = (CardLayout) Cards.getLayout();
				cl.show(Cards,Items[h]);
				for(int l = 0; l < 14; l++){
					if(l == h){
						Button[l].setBackground(Color.CYAN);
					}else{
						Button[l].setBackground(Color.LIGHT_GRAY);
					}
				}
			}
		}
		if(event.getSource() == Novo){
			String Titulo = "Nova Simulação";
			int Resposta = FrameExit(Titulo);
			if(Resposta == JOptionPane.YES_OPTION){
				PD = new Podio();
				FF = new Finais();
				SF = new Semifinais();
				QF = new Quartas();
				OF = new Oitavas();
				new Copa();
			}
		}else if(event.getSource() == Sair){
			String Titulo = "Saída do programa";
			FrameExit(Titulo);
		}
	}
}