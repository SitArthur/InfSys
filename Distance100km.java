package pack;
import javax.swing.*; 
import javax.swing.border.*;
import java.awt.event.*;
import java.awt.*; 
public class Distance100km extends JPanel  {
	private static final long serialVersionUID = 1L;		
	private JPanel Panel_Text, Panel_Button,Panel_Text_1;
	private JButton Button_Calc_100km;
	private JLabel Label_0,Label_1,Label_2,Label_3,Label_4, Label_5,Label_6,Label_7;
	public static JTextField TextField_probeg_do, TextField_probeg_next,TextField_volume, TextField_fuel,TextField_pass_dist;
	public static JCheckBox CheckBox_how_1, CheckBox_how_2;
	public static int CB_how_1, CB_how_2;
	public Distance100km()  { 
		setLayout (new BorderLayout());
		Panel_Text = new JPanel();
		Panel_Text_1 = new JPanel();
		Panel_Button = new JPanel();
		add(Panel_Text, BorderLayout.NORTH);
		add(Panel_Text_1, BorderLayout.CENTER);
		add(Panel_Button, BorderLayout.SOUTH);	
		Panel_Text.setLayout(new GridLayout(1,1));
		Panel_Text_1.setLayout(new GridLayout(7,2,10,10));
		Panel_Button.setLayout(new GridLayout(1,1));
		Panel_Text.setBorder(new EmptyBorder(10,7,7,7));
		Panel_Text_1.setBorder(new EmptyBorder(0,7,45,7));		
		Label_0 = new JLabel("Выберите способ измерения: ");
		Label_1 = new JLabel("1. 'От полного бака' ");
		Label_2 = new JLabel("  Зафиксированный пробег (км):", JLabel.RIGHT);
		Label_3 = new JLabel("  Последний пробег (км): ", JLabel.RIGHT);
		Label_4 = new JLabel("  Объем бака (л):", JLabel.RIGHT);
		Label_5 = new JLabel("2. 'Пройденное расстояние' ");
		Label_6 = new JLabel("  Израсходовано топлива (л):", JLabel.RIGHT);
		Label_7 = new JLabel("  Пройденное расстояние (км):", JLabel.RIGHT);
		Button_Calc_100km = new JButton("Рассчитать расход топлива");
		CheckBox_how_1 = new JCheckBox();
		CheckBox_how_1.setToolTipText("Выбрать способ измерения 'От полного бака'");
		CheckBox_how_2 = new JCheckBox();
		CheckBox_how_2.setToolTipText("Выбрать способ измерения 'Пройденное расстояние'");
		TextField_probeg_do = new JTextField();
		TextField_probeg_do.setMargin(new Insets(2, 5, 2, 5));
		TextField_probeg_do.setToolTipText("Введите пробег, зафиксированный перед использованием автомобиля с полным баком"); 	
		TextField_probeg_next = new JTextField();
		TextField_probeg_next.setMargin(new Insets(2, 5, 2, 5));
		TextField_probeg_next.setToolTipText("Введите последний пробег");
		TextField_volume = new JTextField();
		TextField_volume.setMargin(new Insets(2, 5, 2, 5));
		TextField_volume.setToolTipText("Введите объем бака");
		TextField_fuel = new JTextField();
		TextField_fuel.setMargin(new Insets(2, 5, 2, 5));
		TextField_fuel.setToolTipText("Введите сколько топлива было израсходовано");		
		TextField_pass_dist = new JTextField();
		TextField_pass_dist.setMargin(new Insets(2, 5, 2, 5));
		TextField_pass_dist.setToolTipText("Введите пройденное расстояние");
		Panel_Button.add(Button_Calc_100km);
		Panel_Text.add(Label_0);
		Panel_Text_1.add(Label_1);
		Panel_Text_1.add(CheckBox_how_1);
		Panel_Text_1.add(Label_2);
		Panel_Text_1.add(TextField_probeg_do);
		Panel_Text_1.add(Label_3);
		Panel_Text_1.add(TextField_probeg_next);
		Panel_Text_1.add(Label_4);
		Panel_Text_1.add(TextField_volume);
		Panel_Text_1.add(Label_5);
		Panel_Text_1.add(CheckBox_how_2);
		Panel_Text_1.add(Label_6);
		Panel_Text_1.add(TextField_fuel);
		Panel_Text_1.add(Label_7);
		Panel_Text_1.add(TextField_pass_dist);
		CheckBox_how_1.addItemListener(new ItemListener(){                                                      
			public void itemStateChanged(ItemEvent e) 	
			{
				if (e.getSource()==CheckBox_how_1)
					if(e.getStateChange()==1){
						TextField_fuel.setEditable(false);
						TextField_pass_dist.setEditable(false);
						CheckBox_how_2.setSelected(false);
						CB_how_1=1; 
						CB_how_2=0;
						}
					else {
						TextField_fuel.setEditable(true);
						TextField_pass_dist.setEditable(true);
						CB_how_1=0; 
						}
			}                                                       
    	   }); 	
		CheckBox_how_2.addItemListener(new ItemListener(){                                 
			public void itemStateChanged(ItemEvent e)
			{
				if (e.getSource()==CheckBox_how_2)
					if(e.getStateChange()==1){
						TextField_probeg_do.setEditable(false);
						TextField_probeg_next.setEditable(false);
						TextField_volume.setEditable(false);
						CheckBox_how_1.setSelected(false);	
						CB_how_1=0;
						CB_how_2=1;
					}
					else {
						TextField_probeg_do.setEditable(true);
						TextField_probeg_next.setEditable(true);
						TextField_volume.setEditable(true);
						CB_how_2=0;
						}
			}                                                       
    	   }); 	
		Button_Calc_100km.addActionListener(new ActionListener(){ 
    	    public void actionPerformed(ActionEvent e)  
    	    {   
    	    	if ((CB_how_1==0)&&(CB_how_2==0)){
	    			JDialog D=new JDialog();
	    			JOptionPane.showMessageDialog(D, "Вы должны выбрать один из способов расчета", "Ошибка", JOptionPane.WARNING_MESSAGE);	
    	    	} else {   		
    	    		if (CB_how_1==1){ 
    	    			if ((Index.isValidInput(TextField_probeg_do, "зафиксированный пробег"))&&
    	    					(Index.isValidInput(TextField_probeg_next, "последний пробег"))&&
    	    					(Index.isValidInput(TextField_volume, "объем бака"))){
    	    				if (Double.parseDouble(TextField_probeg_do.getText())>Double.parseDouble(TextField_probeg_next.getText())){ 
    			            	JDialog D=new JDialog();
    		                	JOptionPane.showMessageDialog(D, "Введите правильные данные!", "Ошибка", JOptionPane.WARNING_MESSAGE);
    		                	TextField_probeg_do.requestFocus();
    		                	TextField_probeg_do.setText(""); 
    		                	TextField_probeg_next.setText("");
    			            } else {	    				
    	    					if (Distance.CB_100km==1){
    	    	    	        	Calc.Dan_dist();
    	    						Calc.Dan_dist_100km();
    	    						Calc_distance.main(null);
    	    	    				Index.Index.setVisible(false); 
    	    	    	    	} else {
    	    	    	    		Calc.Dan_dist_100km();
    	    	    				Calc_distance100km.main(null); 
    	    	    				Index.Index.setVisible(false);
    	    	    	    	}
    			            }
    	    			}
    	    		} else {
    	    			if ((Index.isValidInput(TextField_fuel, "количество израсходованного топлива"))&&
    					(Index.isValidInput(TextField_pass_dist, "пройденное расстояние"))){
	    					if (Distance.CB_100km==1){
	    						Calc.Dan_dist();
	    						Calc.Dan_dist_100km();
	    						Calc_distance.main(null);
	    	    				Index.Index.setVisible(false); 
	    	    	    	} else { 
	    	    	    		Calc.Dan_dist_100km(); 
	    	    				Calc_distance100km.main(null); 
	    	    				Index.Index.setVisible(false);
	    	    	    	}
    	    			}
    	    		} 
		         }	
    	    }                                                        
    	   });  		
	}
}