package upskill.utilities;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class AfterActions {
	
	TakeScreenshot TakeScreenshotobj = new TakeScreenshot();
	
	
	@After
	public void afterActions(Scenario Scenario) throws Exception{
		if (Scenario.isFailed()) {
			TakeScreenshotobj.screenshots();
			}

		
		SetupDrivers.tearDownDriver();
		System.out.println(" ------Test Complete, Browser Closed ");
	}
}