import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MarksheetController implements ActionListener {
	MarkSheetView view = new MarkSheetView("MarkSheet");
	MarkSheetModel model = new MarkSheetModel();
	MarksheetController(){
		view.jbtngen.addActionListener(this);
		view.jbtnclose.addActionListener(this);
	}

	public static void main(String[] args) {
		new MarksheetController();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
	        if (e.getSource() == view.jbtngen) {
	        	int num1 = Integer.parseInt(view.jtfoot.getText());
	            int num2 = Integer.parseInt(view.jtfoop.getText());
	            int num3 = Integer.parseInt(view.jtfdb.getText());
	            
	            int total = model.calculateTotal(num1,num2,num3);
	            float per = model.calculatePercentage(total);
	            String division = model.calculateDivision(per);
	            
	        	view.jtftm.setText(String.format("%d",total));
	        	view.jtftp.setText(String.format("%.2f", per));
	        	view.jtfdiv.setText(String.format(division));
	        	view.jtfres.setText(String.format(model.calculateResult(num1,num2,num3)));
	        	
	        } else if (e.getSource() == view.jbtnclose) {
	            view.dispose();

	        }
	    }

		
	}

