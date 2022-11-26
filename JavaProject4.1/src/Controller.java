import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import javax.swing.event.ListSelectionEvent;

import org.tempuri.CRONUS_Sverige_AB_Employee;
import org.tempuri.CronusServiceSoapProxy;

public class Controller {
	private CronusFrame cronusFrame;
	CronusServiceSoapProxy proxy = new CronusServiceSoapProxy();
	
	public Controller(CronusFrame cronusFrame) {
		this.cronusFrame = cronusFrame;
		declareListeners();
		declareFisteners();
		declareTisteners();
		declareRisteners();
	}
	
	//Add-metod allmost all error handling works. primary key exception must not be duplicated
	public void declareListeners() {
		cronusFrame.getBtnAddEmployee().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String employeeFirstName = cronusFrame.getTextField().getText();
				String employeeLastName = cronusFrame.getTextField_1().getText();
				String no = cronusFrame.getTextField_2().getText();
				
				if(cronusFrame.getTextField().getText().isEmpty() && cronusFrame.getTextField_1().getText().isEmpty()
						&& cronusFrame.getTextField_2().getText().isEmpty()) {
					cronusFrame.getTextArea().setText("Please fill in all" + "\n" + "textfields before" + "\n"
						+ "trying to create" + "\n" + "an employee.");
				}
				else if(cronusFrame.getTextField().getText().isEmpty()) {
					cronusFrame.getTextArea().setText("Please fill in first" + "\n" + "name to create" + "\n"
					+ "an employee");
				}
				else if(cronusFrame.getTextField_1().getText().isEmpty()) {
					cronusFrame.getTextArea().setText("Please fill in last" + "\n" + "name to create" + "\n"
							+ "an employee");
				}
				else if(cronusFrame.getTextField_2().getText().isEmpty()) {
					cronusFrame.getTextArea().setText("Please fill in ID" + "\n" + "to create" + "\n"
							+ "an employee");
				}
				else {
					try {
						proxy.insertEmployee(no, employeeFirstName, employeeLastName);
						cronusFrame.getTextArea().setText("Student with the name: " + "\n" + "("
						+ cronusFrame.getTextField().getText() + " " + cronusFrame.getTextField_1().getText()
						+ ")" + "\n" + "and the ID: (" + cronusFrame.getTextField_2().getText() + ")" + "\n" + " was added!");
					} catch (RemoteException e1) {
						
						e1.printStackTrace();
					}
				}
			}
		});
	}
	
	//Delete-metod
	public void declareFisteners() {
		cronusFrame.getBtnDeleteEmployee().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no = cronusFrame.getTextField_2().getText();
				
				if(cronusFrame.getTextField_2().getText().isEmpty()) {
					cronusFrame.getTextArea().setText("Please fill in ID" + "\n" + "to delete" + "\n"
							+ "an employee");
				}
				else if(cronusFrame.getTextField_2().getText().equals(no))  {
					try {
						proxy.deleteEmployee(no);
						cronusFrame.getTextArea().setText("Employees with the" + "\n" + "id:" + cronusFrame.getTextField_2().getText()
								+ "\n" + "was deleted.");
						cronusFrame.getCronusTableModel().fireTableDataChanged();
					} catch (RemoteException e1) {
						e1.printStackTrace();
					}
				}
			}
		});
	}
	
	//Show-metod
	public void declareTisteners() {
	cronusFrame.getBtnFindEmployee().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
				try {
					CRONUS_Sverige_AB_Employee[] employees = proxy.getEmployees();
					for(CRONUS_Sverige_AB_Employee Employee : employees) {
						cronusFrame.getCronusTableModel().addEmployee(Employee);
						cronusFrame.getTextArea().setText("Employees showed" + "\n" + "above");
						cronusFrame.getCronusTableModel().fireTableDataChanged();
					}
				}catch (RemoteException e1) {
			}
				
		}
	});
}
	
	//Update-metod funkar. ingen error hantering.
	public void declareRisteners() {
		cronusFrame.getBtnUpdateEmployee().addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			String employeeFirstName = cronusFrame.getTextField().getText();
			String employeeLastName = cronusFrame.getTextField_1().getText();
			String no = cronusFrame.getTextField_2().getText();
			
			if(cronusFrame.getTextField().getText().isEmpty() && cronusFrame.getTextField_1().getText().isEmpty()
					&& cronusFrame.getTextField_2().getText().isEmpty()) {
				cronusFrame.getTextArea().setText("Please fill in all" + "\n" + "textfields before" + "\n"
					+ "trying to update" + "\n" + "an employee.");
			}
			else if(cronusFrame.getTextField_2().getText().isEmpty()) {
				cronusFrame.getTextArea().setText("Please fill in ID" + "\n" + "to choose which" + "\n"
						+ "employee to update.");
			}
			else if(cronusFrame.getTextField().getText().equals(employeeFirstName)
					&& cronusFrame.getTextField_1().getText().equals(employeeLastName)
					&& cronusFrame.getTextField_2().getText().equals(no)) {
				try {
					proxy.updateEmployee(no, employeeFirstName, employeeLastName);
					cronusFrame.getCronusTableModel().fireTableDataChanged();
					
					cronusFrame.getTextArea().setText("The Employee with the" + "\n" + "ID: (" + 
					cronusFrame.getTextField_2().getText() + ")" + "\n" + "got the updated name" 
					+ "\n" + cronusFrame.getTextField().getText() + " " + cronusFrame.getTextField_1().getText()
							+ "!");
				} catch (RemoteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			
		}
	});
	}
}
