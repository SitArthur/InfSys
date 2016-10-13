package pack; 
import java.awt.*;	
import javax.swing.*;
public class Index extends JFrame{
	private static final long serialVersionUID = 1L;
	public static Index Index = new Index();
	public static void main(String[] args) { 
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index.setVisible(true); 
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static JTabbedPane JTP; 
	public Index() { 
		setTitle("Расчет расхода топлива"); 
		setSize(430, 440); 
		setLocationRelativeTo(null);
		setResizable(false); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JTP = new JTabbedPane(JTabbedPane.TOP);
        getContentPane().add(JTP); 
        Distance dist = new Distance(); 
        JTP.addTab("На определенное расстояние", dist);
        Distance100km dist100km = new Distance100km();
        JTP.addTab("На 100 км", dist100km);
	}
    public static boolean isValidInput(JTextField jtxt, String description) {
        JDialog D = new JDialog();
        if (jtxt.getText().trim().length() > 0) {
            try { 
                 return true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(D, "Вы должны ввести целое число!", "Ошибка", JOptionPane.WARNING_MESSAGE);
                jtxt.requestFocus();
                jtxt.setText("");
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(D, "Введите " + description, "Ошибка", JOptionPane.WARNING_MESSAGE);
            jtxt.requestFocus();
            jtxt.selectAll();
            return false;
        }
    }	
}