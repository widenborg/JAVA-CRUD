import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class ObjectsFrame extends JFrame {

	private JPanel contentPane;
	private JButton btnGetObject;
	private JTable objectsTable;
	private ObjectsTableModel objectsTableModel;
	private JTextField textField;
	

	/**
	 * Create the frame.
	 */
	public ObjectsFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnGetObject = new JButton("Get");
		
		btnGetObject.setBounds(36, 232, 85, 21);
		contentPane.add(btnGetObject);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(36, 21, 379, 182);
		contentPane.add(scrollPane);
		
		objectsTable = new JTable();
		
		objectsTableModel = new ObjectsTableModel();
		objectsTable.setModel(objectsTableModel);
		
		scrollPane.setViewportView(objectsTable);
		
		textField = new JTextField();
		textField.setBounds(131, 232, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		this.setVisible(true);
	}

	public JButton getBtnGetObject() {
		return btnGetObject;
	}

	public ObjectsTableModel getObjectsTableModel() {
		return objectsTableModel;
	}

	public JTextField getTextField() {
		return textField;
	}
	
}
