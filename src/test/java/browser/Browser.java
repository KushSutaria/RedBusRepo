package browser;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Browser {
public static WebDriver driver;
public static Actions act;

public static WebDriver setDriver() {
	try {
	String driverPath=System.getProperty("user.dir")+"\\Driver\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverPath);
	driver = new ChromeDriver();
//	act=new Actions(driver);
	}
	catch (Exception e) {
	System.out.println(e);
	}
	return driver;
}

public static String getWebEl(String s) throws Exception {
	try {
	String filelocation= System.getProperty("user.dir")+"/src/test/resources/config.properties";
	FileInputStream fileinput = new FileInputStream(filelocation);
	Properties prop = new Properties();
	prop.load(fileinput);
	return prop.getProperty(s);
	}
	catch (Exception e) {
		System.out.println(e);
	}
	return null;
}
public static void getUrl() throws Exception {
/*	String filelocation = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";
//	String filelocation= "C:/Users/kshailes/eclipse-workspace/RedBus/src/test/resources/config.properties";
	File file = new File(filelocation);
	FileInputStream fileinput = new FileInputStream(file);
	Properties prop = new Properties();
	prop.load(fileinput);
	driver.get(prop.getProperty("url")); //redbus.in
	System.out.println(prop.getProperty("url"));	*/
	try {
	driver.get(getWebEl("url"));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	catch (Exception e) {
		System.out.println(e);
	}
}



public static void closeBrowser() {
	try {
	driver.close();
	}
	catch (Exception e) {
	System.out.println(e);
	}
}
/*
public static void main(String[] args) throws Exception {
	setDriver();
	getUrl();
	
}
*/
}
