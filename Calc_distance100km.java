package pack;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
public class Calc_distance100km extends JDialog {
	private static final long serialVersionUID = 1L;
	public static void main(String[] args) {
		try {
			Calc_distance100km Calc_distance100km = new Calc_distance100km();
			Calc_distance100km.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			Calc_distance100km.setVisible(true);
			Calc.Calcul_distance_100km(); 
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static JLabel Label_100km, Label_dist, Label_fuel;
	public Calc_distance100km() {
		setTitle("Расчет расхода топлива на 100 километров");
		setSize(430, 440);
		setLocationRelativeTo(null);
		setResizable(false);
		getContentPane().setLayout(new BorderLayout());
		JPanel buttonPane = new JPanel();
		getContentPane().add(buttonPane, BorderLayout.SOUTH);
		buttonPane.setLayout(new GridLayout(1, 2, 10, 5));
		JButton Button_delete = new JButton("Очистить результаты");
		buttonPane.add(Button_delete);
		JButton Button_exit = new JButton("Закрыть");
		buttonPane.add(Button_exit);
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 7, 15));
		panel.setBorder(new EmptyBorder(74,0,123,0));
        Font font = new Font(null, Font.BOLD, 13);
		JLabel Label_1 = new JLabel("Автомобиль проехал");
		panel.add(Label_1);
		Label_dist = new JLabel("");
		panel.add(Label_dist);
		Label_dist.setFont(font);
		Label_dist.setForeground(Color.BLUE);
		JLabel Label_2 = new JLabel("км");
		panel.add(Label_2);
		JLabel Label_3 = new JLabel("используя");
		panel.add(Label_3);
		Label_fuel = new JLabel("");
		panel.add(Label_fuel);
		Label_fuel.setFont(font);
		Label_fuel.setForeground(Color.BLUE);
		JLabel Label_4 = new JLabel("л.");
		panel.add(Label_4);
		JLabel Label_5 = new JLabel("Значит, средний расход топлива на 100 км составляет");
		panel.add(Label_5);
		Label_100km = new JLabel("");
		panel.add(Label_100km);
		Label_100km.setFont(font);
		Label_100km.setForeground(Color.BLUE);
		JLabel Label_6 = new JLabel("л топлива.");
		panel.add(Label_6);
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