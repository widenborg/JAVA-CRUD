import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class CronusFrame extends JFrame {

	private JPanel contentPane;
	private JButton btnAddEmployee;
	private JButton btnDeleteEmployee;
	private JButton btnFindEmployee;
	private JButton btnUpdateEmployee;
	private JTable employeeTable;
	private JTextField textField;
	private CronusTableModel cronusTableModel;
	private JTextField textField_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JTextField textField_2;
	private JLabel lblNewLabel_2;
	private JTextArea textArea;


	/**
	 * Create the frame.
	 */
	public CronusFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 346);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnAddEmployee = new JButton("Add");
		
		btnAddEmployee.setBounds(232, 273, 89, 23);
		contentPane.add(btnAddEmployee);
		
		btnDeleteEmployee = new JButton("Delete");
		
		btnDeleteEmployee.setBounds(430, 273, 89, 23);
		contentPane.add(btnDeleteEmployee);
		
		btnFindEmployee = new JButton("Show employees");
		
		btnFindEmployee.setBounds(26, 273, 131, 23);
		contentPane.add(btnFindEmployee);
		
		btnUpdateEmployee = new JButton("Update");
		
		btnUpdateEmployee.setBounds(331, 273, 89, 23);
		contentPane.add(btnUpdateEmployee);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 509, 174);
		contentPane.add(scrollPane);
		
		employeeTable = new JTable();
		
		cronusTableModel = new CronusTableModel();
		employeeTable.setModel(cronusTableModel);
		
		scrollPane.setViewportView(employeeTable);
		
		textField = new JTextField();
		textField.setBounds(235, 220, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(331, 220, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblNewLabel = new JLabel("First name");
		lblNewLabel.setBounds(236, 200, 89, 20);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Last name");
		lblNewLabel_1.setBounds(333, 203, 89, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(433, 220, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setBounds(434, 202, 89, 14);
		contentPane.add(lblNewLabel_2);
		
		textArea = new JTextArea();
		textArea.setBounds(26, 196, 136, 73);
		contentPane.add(textArea);
		
		this.setVisible(true);
	}


	public JButton getBtnAddEmployee() {
		return btnAddEmployee;
	}


	public JButton getBtnDeleteEmployee() {
		return btnDeleteEmployee;
	}
	
	public JButton getBtnFindEmployee() {
		return btnFindEmployee;
	}

	public JButton getBtnUpdateEmployee() {
		return btnUpdateEmployee;
	}

	public JTextField getTextField() {
		return textField;
	}

	public JTextField getTextField_1() {
		return textField_1;
	}

	public JTextField getTextField_2() {
		return textField_2;
	}

	public CronusTableModel getCronusTableModel() {
		return cronusTableModel;
	}
	public JTextArea getTextArea() {
		return textArea;
	}
	public JTable getEmployeeTable() {
		return employeeTable;
	}
	
}
