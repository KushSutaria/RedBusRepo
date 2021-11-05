package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import browser.Browser;
import locators.Locators;

public class Page1 {
public static void method1() {
	try {
	System.out.println("user is booking ticket");
	Locators.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	Thread.sleep(2000);
	JavascriptExecutor executor=(JavascriptExecutor) Browser.driver;
	executor.executeScript("arguments[0].click()", Locators.HideBus());			//Minimize the first section of buses
	//Locators.HideBus().click();
	Locators.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//Thread.sleep(5000);
	//Locators.viewSeats().click();
	executor.executeScript("arguments[0].click()", Locators.viewSeats());		//Click on view button to select seats
	System.out.println("done");
	System.out.println("select the seat");										//Manually select seat
	Locators.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	Thread.sleep(5000);
	executor.executeScript("arguments[0].click()", Locators.checkboxBoarding());	//Click on boarding location
	//Locators.checkboxBoarding().click();
	Locators.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//	Thread.sleep(2000);
	//Locators.DroppingPointText().click();
	executor.executeScript("arguments[0].click()", Locators.DroppingPointText());	//Click on Dropping point text
	Locators.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

//	Thread.sleep(3000);
	//Locators.checkboxDropping().click();
	executor.executeScript("arguments[0].click()", Locators.checkboxDropping());	//Click on the drop point location
	System.out.println("done");
	}
	catch (Exception e) {
		System.out.println(e);
	}
}
}
