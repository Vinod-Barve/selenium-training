package testng;

import org.testng.annotations.DataProvider;

public class ExternalDataProviderClass {
	
	
	@DataProvider(name="externalDataProvider", parallel=true)
	public static Object[] externalDataProvider() {
		Object[] weekDays = new Object[7];
		
		weekDays[0] = "Happy Monday !!!";
		weekDays[1] = "Happy Tuesday !!!";
		weekDays[2] = "Happy Wednesday !!!";
		weekDays[3] = "Happy Thursday !!!";
		weekDays[4] = "Happy Friday !!!";
		weekDays[5] = "Happy Saturday !!!";
		weekDays[6] = "Happy Sunday !!!";

		return weekDays;	
	}
}
