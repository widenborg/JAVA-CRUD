
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class MetaTableModel extends AbstractTableModel {
	private ArrayList<Object> objects = new ArrayList<Object>();
	private String[] columns = {" X "};
	
	public void addObject(Object newObject) {
		objects.add(newObject);
		this.fireTableDataChanged();
	}
	
	@Override
	public int getRowCount() {
		// TODO Auto-generated method stub
		return objects.size();

	}

	@Override
	public int getColumnCount() {
		// TODO Auto-generated method stub

		return columns.length;

	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {

		Object tmpObject = objects.get(rowIndex);
		// TODO Auto-generated method stub
		switch(columnIndex) {
		case 0:
			return tmpObject.toString();
		}
		return null;
		}
		
	}

		// TODO Auto-generated method stub
		return null;
	}
 
	
}
