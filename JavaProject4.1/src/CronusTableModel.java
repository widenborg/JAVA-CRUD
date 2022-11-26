import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

import org.tempuri.CRONUS_Sverige_AB_Employee;

public class CronusTableModel extends AbstractTableModel {
	private ArrayList<CRONUS_Sverige_AB_Employee> employees = new ArrayList<CRONUS_Sverige_AB_Employee>();
	private String[] columns = {"First name", "Last name", "ID"};
	
	public void addEmployee(CRONUS_Sverige_AB_Employee employee) {
		employees.add(employee);
		this.fireTableDataChanged();
	}
	
	@Override
	public int getRowCount() {
		return employees.size();
	}

	@Override
	public int getColumnCount() {
		return columns.length;
	}
	
	@Override
	public String getColumnName(int columnIndex) {
		return columns[columnIndex];
	}

	@Override
	public String getValueAt(int rowIndex, int columnIndex) {
		CRONUS_Sverige_AB_Employee tmpEmployee = employees.get(rowIndex);
		
		switch(columnIndex) {
		case 0: return tmpEmployee.getFirst_Name();
		case 1: return tmpEmployee.getLast_Name();
		case 2: return tmpEmployee.getNo_();
		}
		return null;
		}
	/*
	@Override
	public void setValueAt(Object val, int rowIndex, int columnIndex) {
		CRONUS_Sverige_AB_Employee tmpEmployee = employees.get(rowIndex);
		
		if(columnIndex == 0) {
			String newName = val.toString();
			tmpEmployee.setFirst_Name(newName);
		} else if(columnIndex == 1) {
			String newName = val.toString();
			tmpEmployee.setLast_Name(newName);
		}
	}
	
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		if(columnIndex == 2) {
			return false;
		} else {
			return true;
		}
	}
	*/	
	}