import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.rmi.RemoteException;

import org.tempuri.*;

public class Controller { 
	 
	private CronusMetaFrame cronusMetaFrame;  
	CronusServiceSoapProxy proxy = new CronusServiceSoapProxy();
	
     
	public Controller(CronusMetaFrame cronusMetaFrame) { 

		this.cronusMetaFrame = cronusMetaFrame;
		declareListeners();
		declareListeners1();
		declareListeners2();
		declareListeners3();
		declareListeners4();
		declareListeners5();
		declareListeners6();
		declareListeners7();
		declareListeners8();
		declareListeners9();
		declareListeners10();
		
	} 
	
	public void fillDataTable(String[][] dataList) {

		cronusMetaFrame.getTableModel().setColumnCount(0);
		cronusMetaFrame.getTableModel().setRowCount(0);

		try {

			
			for (int k = 0; k < dataList[0].length; k++) {

				cronusMetaFrame.getTableModel().addColumn(k);
			}
			
			for (int i = 0; i < dataList.length; i++) {
				
				// Create empty string list with the length of the content list 
				String[] tableRow = new String[dataList[i].length];

				for (int j = 0; j < tableRow.length; j++) {
					tableRow[j] = dataList[i][j];
				}
				
				cronusMetaFrame.getTableModel().addRow(tableRow);
			}
			
			// Show the tableModel containing the values added
			cronusMetaFrame.getTable().setModel(cronusMetaFrame.getTableModel());
		} catch (Exception ex) {
			//cronusMetaFrame.getTxtMessage().setText("An unexpected error occured");
		}

	}

	public void declareListeners() {  
		cronusMetaFrame.getBtnAllKeys().addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
				   
				   cronusMetaFrame.getBtnAllKeys().addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							try {
								fillDataTable(proxy.readAllKeysJava());
							} catch (RemoteException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					});
				}
			});
	}
	
	public void declareListeners1() {  
		cronusMetaFrame.getBtnEmployeeRelatives().addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
							try {
								fillDataTable(proxy.readEmployeesAndRelativesJava());
							} catch (RemoteException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						}
					});

	}
	
	public void declareListeners2() {  
		cronusMetaFrame.getBtnAbsentSickness().addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
				   try {
						fillDataTable(proxy.readAllSickEmployees2004Java());
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
	}
	
	public void declareListeners3() {  
		cronusMetaFrame.getBtnMostAbsentEmployee().addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
					try {
						fillDataTable(proxy.readHighestAbsenceJava());
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			});
	}
	
	public void declareListeners4() {  
		cronusMetaFrame.getBtnAllIndexes().addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
				   try {
						fillDataTable(proxy.readAllIndexesJava());
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
	}
	
	public void declareListeners5() {  
		cronusMetaFrame.getBtnContentsEmployee().addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
				   try {
						fillDataTable(proxy.readEmployeeAndRelatedTablesJava());
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
	}
	
	public void declareListeners6() {  
		cronusMetaFrame.getBtnAllTables1().addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
				   try {
						fillDataTable(proxy.readAllTables1Java());
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			});
	}
	
	public void declareListeners7() {  
		cronusMetaFrame.getBtnAllTables2().addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
				   try {
						fillDataTable(proxy.readAllTables2Java());
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

				}
			}); 
	}

	
	public void declareListeners8() {  
		cronusMetaFrame.getBtnAllConstraints().addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
					try {
						fillDataTable(proxy.readAllTableConstraintsJava());
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
	}
	
	public void declareListeners9() {  
		cronusMetaFrame.getBtnAllColumns1().addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
				   try {
						fillDataTable(proxy.readEmployeeColumns1Java());
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
	}
	
	public void declareListeners10() {  
		cronusMetaFrame.getBtnAllColumns2().addActionListener(new ActionListener() {
			   public void actionPerformed(ActionEvent e) {
				   try {
						fillDataTable(proxy.readEmployeeColumns2Java());
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			});
	}
}

