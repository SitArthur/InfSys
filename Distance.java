package pack;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*; 
import java.awt.*; 
public class Distance extends JPanel {
	private static final long serialVersionUID = 1L;
	private JPanel Panel_Text, Panel_Button;
	private JButton Button_Calc;
	private JLabel Label_1,Label_2,Label_3,Label_4; 
	public static JTextField TextField_100km,TextField_distance,TextField_price;
	public static JCheckBox CheckBox_100km;
	public static int  CB_100km;
	public Distance()  {  
		setLayout (new BorderLayout());
		Panel_Text = new JPanel(); 
		Panel_Button = new JPanel();
		add(Panel_Text, BorderLayout.CENTER);
		add(Panel_Button, BorderLayout.SOUTH);		
		Panel_Text.setLayout(new GridLayout(4,2,10,10));
		Panel_Button.setLayout(new GridLayout(1,1));		
		Panel_Text.setBorder(new EmptyBorder(74,7,123,7));		
		Label_1 = new JLabel("Расход топлива на 100 км (л): ", JLabel.RIGHT);
		Label_2 = new JLabel("Рассчитать автоматически", JLabel.RIGHT);
		Label_3 = new JLabel("Расстояние (км): ", JLabel.RIGHT);
		Label_4 = new JLabel("Цена топлива за 1 л. (руб.):", JLabel.RIGHT);
		Button_Calc = new JButton("Рассчитать расход топлива"); 		
		CheckBox_100km = new JCheckBox();
		CheckBox_100km.setToolTipText("Рассчитать расход топлива на 100 км (после нажатия на кнопку 'Рассчитать' откроется вкладка 'На 100 км')");
		
		TextField_100km = new JTextField();
		TextField_100km.setMargin(new Insets(2, 5, 2, 5));
		TextField_100km.setToolTipText("Введите расход топлива на 100 км");    	
		TextField_distance = new JTextField();
		TextField_distance.setMargin(new Insets(2, 5, 2, 5));
		TextField_distance.setToolTipText("Введите расстояние в км");    			
		TextField_price = new JTextField();
		TextField_price.setMargin(new Insets(2, 5, 2, 5));
		TextField_price.setToolTipText("Введите цену топлива за 1 литр");
		
		Panel_Button.add(Button_Calc);
		
		Panel_Text.add(Label_1);
		Panel_Text.add(TextField_100km);
		Panel_Text.add(Label_2);
		Panel_Text.add(CheckBox_100km);
		Panel_Text.add(Label_3);
		Panel_Text.add(TextField_distance);
		Panel_Text.add(Label_4);
		Panel_Text.add(TextField_price);


		CheckBox_100km.addItemListener(new ItemListener(){                                                    
			public void itemStateChanged(ItemEvent e)
			{
				if (e.getSource()==CheckBox_100km) 
					if(e.getStateChange()==1){ 
						TextField_100km.setEditable(false); 				
						CB_100km=1; 					}
					else {
						TextField_100km.setEditable(true);
						CB_100km=0; 					}
			}                                                       
    	   }); 		
		Button_Calc.addActionListener(new ActionListener(){
    	    public void actionPerformed(ActionEvent e)        
    	    {   
    	    
    	    	if ((Index.isValidInput(TextField_distance, "расстояние"))&&
        	    		(Index.isValidInput(TextField_price, "цену топлива за 1 литр"))){
    	    		if (CB_100km==1){	
    	    			Index.JTP.setSelectedIndex(1);
    	    		} else {
    	    			if (Index.isValidInput(TextField_100km, "расход топлива на 100 км")) {
    	    				Calc.Dan_dist();
    	    				Calc_distance.main(null);  
    	    				Index.Index.setVisible(false); 
    	    				}
    	    		}
		         }
    	    }    	    	                                                        
    	   });  	
    	
    	
		
	}
	

	
}