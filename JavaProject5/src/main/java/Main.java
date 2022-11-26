import org.tempuri.*;

public class Main {

	public static void main(String[] args) { 
		 
		CronusServiceSoapProxy proxy = new CronusServiceSoapProxy();
		 
		CronusMetaFrame cronusMetaFrame = new CronusMetaFrame(); 
		Controller controller = new Controller(cronusMetaFrame);

	}

}
