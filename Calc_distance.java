package pack;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class Calc_distance extends JDialog {
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		try {
			Calc_distance Calc_distance = new Calc_distance(); 
			Calc_distance.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			Calc_distance.setVisible(true); 
			Calc.Calcul_distance(); 		
			} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static JLabel Label_100km, Label_n_km, Label_n_l, Label_price;
	public Calc_distance() {
		setTitle("Расчет расхода топлива"); 		
		setSize(430, 440); 		
		setLocationRelativeTo(null);
		setResizable(false); 		
		getContentPane().setLayout(new BorderLayout());
		JPanel Panel_button = new JPanel();
		getContentPane().add(Panel_button, BorderLayout.SOUTH);
		Panel_button.setLayout(new GridLayout(1, 2, 10, 5));
		JButton Button_delete = new JButton("Очистить результаты");
		Panel_button.add(Button_delete);
		JButton Button_exit = new JButton("Закрыть");
		Panel_button.add(Button_exit);
		JPanel Panel_text = new JPanel();
		getContentPane().add(Panel_text, BorderLayout.CENTER);
		Panel_text.setLayout(new FlowLayout(FlowLayout.LEFT, 7, 15));
		Panel_text.setBorder(new EmptyBorder(74,0,123,0));
        Font font = new Font(null, Font.BOLD, 13);
		JLabel Label_1 = new JLabel("Средний расход топлива на 100 км составляет");
		Panel_text.add(Label_1);
		Label_100km = new JLabel("");
		Panel_text.add(Label_100km);
		Label_100km.setFont(font); 
		Label_100km.setForeground(Color.BLUE);
		JLabel Label_2 = new JLabel("л.");
		Panel_text.add(Label_2);
		JLabel Label_3 = new JLabel("Значит, для того, чтобы проехать");
		Panel_text.add(Label_3);
		Label_n_km = new JLabel("");
		Panel_text.add(Label_n_km);
		Label_n_km.setFont(font);
		Label_n_km.setForeground(Color.BLUE);
		JLabel Label_4 = new JLabel("км");
		Panel_text.add(Label_4);
		JLabel Label_5 = new JLabel("необходимо");
		Panel_text.add(Label_5);
		Label_n_l = new JLabel("");
		Panel_text.add(Label_n_l);
		Label_n_l.setFont(font);
		Label_n_l.setForeground(Color.BLUE);
		JLabel Label_6 = new JLabel("л топлива.");
		Panel_text.add(Label_6);
		JLabel Label_7 = new JLabel("Стоимость поездки составит");
		Panel_text.add(Label_7);
		Label_price = new JLabel("");
		Panel_text.add(Label_price);
		Label_price.setFont(font);
		Label_price.setForeground(Color.BLUE);
		JLabel Label_8 = new JLabel("руб.");
		Panel_text.add(Label_8);	
		Button_exit.addActionListener(new ActionListener()
		   {                                                         
		    public void actionPerformed(ActionEvent e)      
		    {
	            System.exit(0);		    	
		    }                                                        
		   }); 
		Button_delete.addActionListener(new ActionListener()     
		   {		
		    public void actionPerformed(ActionEvent e)  
		    {
		    	setVisible(false);		    
		    	Index.Index.setVisible(true);
		    	Distance.TextField_100km.setText("");
		    	Distance.TextField_distance.setText("");
		    	Distance.TextField_price.setText("");
		    	Distance.CheckBox_100km.setSelected(false);
		    	Distance.CB_100km=0;
		    	
		    	Distance100km.TextField_probeg_do.setText("");
		    	Distance100km.TextField_probeg_next.setText("");
		    	Distance100km.TextField_volume.setText("");
		    	Distance100km.TextField_fuel.setText("");
		    	Distance100km.TextField_pass_dist.setText("");
		    	Distance100km.CheckBox_how_1.setSelected(false);
		    	Distance100km.CheckBox_how_2.setSelected(false);
		    	
		    	Distance100km.CB_how_1=0;
		    	Distance100km.CB_how_2=0;
			    Index.JTP.setSelectedIndex(0);
		    }                                                        
		   }); 
	}
	}
	 	
