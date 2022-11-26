import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;

import org.tempuri.Course;
import org.tempuri.HasStudied;
import org.tempuri.OverflowServiceSoapProxy;
import org.tempuri.StudentLoan;
import org.tempuri.Studies;
import org.tempuri.Teacher;
import org.tempuri.Vehicle;
import org.tempuri.WorksOn;

public class Controller {
	
	private ObjectsFrame objectsFrame;
	OverflowServiceSoapProxy proxy = new OverflowServiceSoapProxy();

	public Controller(ObjectsFrame objectsFrame) {
		this.objectsFrame = objectsFrame;
		declareListeners();
		//populateTable();
		
		
	}
	
	/*public void populateTable() {
		Object[] objects = null;
		try {
			objects = proxy.studentCollection();
			for(Object tmpObject : objects) {
				objectsFrame.getObjectsTableModel().addObject(tmpObject);
			}
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	public void declareListeners() {
		objectsFrame.getBtnGetObject().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object obj = objectsFrame.getTextField().getText();
				
				
				
				if(obj.equals("Student"))
				{
					Object[] objects = null;
					try {
						objects = proxy.studentCollection();
						for(Object tmpObject : objects) {
							objectsFrame.getObjectsTableModel().addObject(tmpObject);
						}
					}catch (RemoteException e1) {
						
					}
				}
				else if(obj.equals("Course")) {
					try {
						
						for(Course course : proxy.courseCollection()) {
							objectsFrame.getObjectsTableModel().addObject(course);
						}
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				else if(obj.equals("Teacher")) 
				{
					try {
						for(Teacher teacher : proxy.teacherCollection()) {
							objectsFrame.getObjectsTableModel().addObject(teacher);
						}
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(obj.equals("Student loan")) 
				{
					try {
						for(StudentLoan sLoan : proxy.studentLoanCollection()) {
							objectsFrame.getObjectsTableModel().addObject(sLoan);
						}
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(obj.equals("Vehicle")) 
				{
					try {
						for(Vehicle vehicle : proxy.vehicleCollection()) {
							objectsFrame.getObjectsTableModel().addObject(vehicle);
						}
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(obj.equals("Works on")) 
				{
					try {
						for(WorksOn worksOn : proxy.worksOnCollection()) {
							objectsFrame.getObjectsTableModel().addObject(worksOn);
						}
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}else if(obj.equals("Studies")) 
				{
					try {
						for(Studies studies : proxy.studiesCollection()) {
							objectsFrame.getObjectsTableModel().addObject(studies);
						}
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				else if(obj.equals("Has studied")) 
				{
					try {
						for(HasStudied hasStudied : proxy.hasStudiedCollection()) {
							objectsFrame.getObjectsTableModel().addObject(hasStudied);
						}
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}
		});
	}
}