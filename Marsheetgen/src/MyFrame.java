import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 

public class MyFrame extends JFrame implements ActionListener{
	JLabel jlboot = new JLabel("Enter OOT Marks");     
    JLabel jlboop = new JLabel("Enter OOp Marks"); 
    JLabel jlbdb = new JLabel("Enter DB Marks");  
    
    JTextField jtfoot = new JTextField();  
    JTextField jtfoop = new JTextField(); 
    JTextField jtfdb = new JTextField();
    
    JButton jbtngen = new JButton("Generate");
    JButton jbtnclose = new JButton("Close");
    
    JLabel jlbtm = new JLabel("Total Marks");  
    JLabel jlbtp = new JLabel("Total Percentage"); 
    JLabel jlbdiv = new JLabel("Division");    
    JLabel jlbres = new JLabel("Result");
    
    JTextField jtftm = new JTextField("0.0");
    JTextField jtftp = new JTextField("0.0");      
    JTextField jtfdiv = new JTextField("");     
    JTextField jtfres = new JTextField(""); 

	public MyFrame(String title) {
		setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(700, 700);
        prepareGUI();
        setVisible(true);  
           
    }
    void prepareGUI(){
    	Container window = getContentPane();
    	window.setLayout(null);
    	
        jtfres.setBounds(300,520,250, 40);
        jtfres.setHorizontalAlignment(SwingConstants.CENTER);
        jlbres.setBounds(30,520,250, 40);
        jtfdiv.setBounds(300,450,250, 40);
        jtfdiv.setHorizontalAlignment(SwingConstants.CENTER);
        jlbdiv.setBounds(30,450,250, 40);
        jtftp.setBounds(300,380,250, 40);
        jtftp.setHorizontalAlignment(SwingConstants.CENTER);
        jlbtp.setBounds(30,380,250, 40);
        jtftm.setBounds(300,310,250, 40);
        jtftm.setHorizontalAlignment(SwingConstants.CENTER);
        jlbtm.setBounds(30,310,250, 40);
        jbtnclose.setBounds(300,240,250, 40);
        jbtnclose.addActionListener(this);
        jbtngen.setBounds(30,240,250, 40);
        jbtngen.addActionListener(this);
        jtfdb.setBounds(300,170,250, 40); 
        jtfdb.setHorizontalAlignment(SwingConstants.CENTER);
        jtfoop.setBounds(300,100,250, 40);
        jtfoop.setHorizontalAlignment(SwingConstants.CENTER);
        jtfoot.setBounds(300,30,250, 40);  
        jtfoot.setHorizontalAlignment(SwingConstants.CENTER);
        jlbdb.setBounds(30,170,250, 40);  
        jlboop.setBounds(30,100,250, 40);  
        jlboot.setBounds(30,30,250, 40);  
    	window.add(jlboot);
    	window.add(jtfoot);
    	window.add(jlboop);
    	window.add(jtfoop);
    	window.add(jlbdb);
    	window.add(jtfdb);
        
    	window.add(jbtngen);
    	window.add(jbtnclose);
        
    	window.add(jlbtm);
    	window.add(jtftm);
    	window.add(jlbtp);
    	window.add(jtftp);
    	window.add(jlbdiv);
    	window.add(jtfdiv);
    	window.add(jlbres);
        window.add(jtfres);
    }
	public static void main(String[] args) {
		new MyFrame("Marksheet Generator");  
	}
	 public void actionPerformed(ActionEvent e) {
	        
	        // handle button click events
	        if (e.getSource() == jbtngen) {
	            float num1 = Float.parseFloat(jtfoot.getText());
	            float num2 = Float.parseFloat(jtfoop.getText());
	            float num3 = Float.parseFloat(jtfdb.getText());
	            String division = "";
                String result = "";
                float total = 0;
	            float percentage = 0;
	            total = num1 + num2 + num3;
                percentage = (float) (total / 3.0);
				if (num1 > 100 || num2 >100 || num3 >100) {
	                 
	                
	            } else if (num1 < 40 || num2 < 40 || num3 < 40) {
	            	division = "Fail";
	            	result = "Fail";
				}
	            
	            else {
	                
	                
	                if (percentage >= 60) {
	                    division = "First Division";
	                } else if (percentage >= 45) {
	                    division = "Second Division";
	                } else if (percentage >= 33) {
	                    division = "Third Division";
	                } 
	                result ="Pass";
	                
	            }
	            jtftm.setText(String.format("%.1f", total));
                jtftp.setText(String.format("%.2f",percentage));
                jtfdiv.setText(division);
                jtfres.setText(result);
	            
	        } else if (e.getSource() == jbtnclose) {
	            
	            System.out.println("Button 2 clicked!");
	        }
	    }

}



   

