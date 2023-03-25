import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 

public class MarkSheetView extends JFrame implements ActionListener{
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
    
    JLabel jtftm = new JLabel("0.0");
    JLabel jtftp = new JLabel("0.0");      
    JLabel jtfdiv = new JLabel("");     
    JLabel jtfres = new JLabel(""); 
    
    JLabel lbresp = new JLabel();
    
	public MarkSheetView(String title) {
		setTitle(title);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 650);
        prepareGUI();
        setVisible(true);  
           
    }
    void prepareGUI(){
    	Container window = getContentPane();
    	window.setLayout(null);
    	
        jtfres.setBounds(300,520,250, 40);
        jtfres.setHorizontalAlignment(SwingConstants.CENTER);
//        jtfres.setEditable(false);
        jlbres.setBounds(30,520,250, 40);
       
        jtfdiv.setBounds(300,450,250, 40);
        jtfdiv.setHorizontalAlignment(SwingConstants.CENTER);
//        jtfdiv.setEditable(false);
        jlbdiv.setBounds(30,450,250, 40);
        
        jtftp.setBounds(300,380,250, 40);
        jtftp.setHorizontalAlignment(SwingConstants.CENTER);
//        jtftp.setEditable(false);
        jlbtp.setBounds(30,380,250, 40);
        
        jtftm.setBounds(300,310,250, 40);
        jtftm.setHorizontalAlignment(SwingConstants.CENTER);
//        jtftm.setEditable(false);
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
        
        lbresp.setBounds(30,580,250, 40);
        
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
        window.add(lbresp);
    }

	
}



   

