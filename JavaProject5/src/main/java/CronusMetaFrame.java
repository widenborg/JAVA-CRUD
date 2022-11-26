import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class CronusMetaFrame extends JFrame {

	private JPanel contentPane;
	private JButton btnAllKeys; 
	private JButton btnAllIndexes; 

	private JButton btnEmployeeRelatives; 
	private JButton btnAbsentSickness; 
	private JButton btnMostAbsentEmployee;  
	private JButton btnContentsEmployee; 
	private JButton btnAllTables1; 
	private JButton btnAllTables2; 
	private JButton btnAllConstraints; 
	private JButton btnAllColumns1; 
	private JButton btnAllColumns2; 

	private JButton btnEmployeeRelatives;
	private JTable table;
	private DefaultTableModel tableModel;

	

	/**
	 * Create the frame.
	 */
	public CronusMetaFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 759, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnAllKeys = new JButton("All Keys");
		btnAllKeys.setBounds(10, 277, 89, 23);
		contentPane.add(btnAllKeys);
		
		btnAllIndexes = new JButton("All Indexes");
		btnAllIndexes.setBounds(10, 311, 89, 23);
		contentPane.add(btnAllIndexes);
		
		btnEmployeeRelatives = new JButton("Employees and their relatives");

		btnEmployeeRelatives.setBounds(20, 345, 173, 23);
		contentPane.add(btnEmployeeRelatives);
		
		btnAbsentSickness = new JButton("Absent due to sickness");
		btnAbsentSickness.setBounds(374, 277, 150, 23);
		contentPane.add(btnAbsentSickness);
		
		btnMostAbsentEmployee = new JButton("Most absent employee");
		btnMostAbsentEmployee.setBounds(232, 345, 157, 23);
		contentPane.add(btnMostAbsentEmployee);
		
		btnContentsEmployee = new JButton("Contents for employee");
		btnContentsEmployee.setBounds(147, 277, 143, 23);
		contentPane.add(btnContentsEmployee);
		
		btnAllTables1 = new JButton("All tables 1");
		btnAllTables1.setBounds(415, 311, 109, 23);
		contentPane.add(btnAllTables1);
		
		btnAllTables2 = new JButton("All tables 2");
		btnAllTables2.setBounds(415, 345, 109, 23);
		contentPane.add(btnAllTables2);
		
		btnAllConstraints = new JButton("All table_constraints");
		btnAllConstraints.setBounds(576, 277, 129, 23);
		contentPane.add(btnAllConstraints);
		
		btnAllColumns1 = new JButton("All columns 1");
		btnAllColumns1.setBounds(570, 311, 109, 23);
		contentPane.add(btnAllColumns1);
		
		btnAllColumns2 = new JButton("All columns 2");
		btnAllColumns2.setBounds(580, 345, 109, 23);
		contentPane.add(btnAllColumns2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 702, 212);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);

		 
		tableModel = (DefaultTableModel) table.getModel();
		/*metaTableModel = new MetaTableModel();
		table.setModel(metaTableModel);*/
		
		this.setVisible(true);
	} 
	public JButton getBtnAllKeys() { 
	    return btnAllKeys;
}    
	public JButton getBtnAllIndexes() { 
		return btnAllIndexes;
	} 
	public JButton getBtnEmployeeRelatives() { 
		return btnEmployeeRelatives;
	} 
	public JButton getBtnAbsentSickness() { 
		return btnAbsentSickness;
	} 
	public JButton getBtnMostAbsentEmployee() { 
		return btnMostAbsentEmployee;

	} 

	public JButton getBtnContentsEmployee() { 
		return btnContentsEmployee;
	} 
	public JButton getBtnAllTables1() { 
		return btnAllTables1;
	} 
	public JButton getBtnAllTables2() { 
		return btnAllTables2;
	} 
	public JButton getBtnAllConstraints() { 
		return btnAllConstraints;
	} 
	public JButton getBtnAllColumns1() { 
		return btnAllColumns1;
	} 
	public JButton getBtnAllColumns2() { 
		return btnAllColumns2; 
	} 
	
	public JTable getTable() {
		return table;
	}
	public DefaultTableModel getTableModel() {
		return tableModel;
	}
	
	
} 
