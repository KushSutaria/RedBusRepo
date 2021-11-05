package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import browser.Browser;

public class Locators extends Browser {
public static WebElement modifyDate() {
final WebElement modify=Locators.driver.findElement(By.xpath("//*[@id=\"fixer\"]/div/div/div[2]"));
return modify;
}

public static WebElement viewSeats() throws Exception {
	String id=browser.Browser.getWebEl("viewseat");
final WebElement vseats=Locators.driver.findElement(By.xpath(id));
return vseats;
}

public static WebElement HideBus() {
	final WebElement hideSeats=Locators.driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/div[3]/div[1]/div[2]/div/div[4]/div[2]"));
	return hideSeats;
}

public static WebElement selectSeats() {
final WebElement sseats=Locators.driver.findElement(By.xpath("//*[@id=\"rt_14842887\"]/div/div/div/div[3]/div[2]/div[2]/canvas"));
return sseats;
}
public static WebElement checkboxBoarding() {
final WebElement cbox_boardp=Locators.driver.findElement(By.xpath("//*[@id=\"14842887\"]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/ul/li[1]/div[1]/div"));
return cbox_boardp;
}

public static WebElement DroppingPointText() {
final WebElement droppingPoint=Locators.driver.findElement(By.xpath("//*[@id=\"14842887\"]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[1]/header/div[2]/span"));
return droppingPoint;
}

public static WebElement checkboxDropping() {
final WebElement cbox_dropp=Locators.driver.findElement(By.xpath("//*[@id=\"14842887\"]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/ul/li[4]/div[1]/div"));
return cbox_dropp;
}

public static WebElement passengerFormCrossbutton() {
final WebElement cross=Locators.driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[5]/div[2]/span"));
return cross;
}

public static WebElement fareDetails() {
final WebElement fDButton=Locators.driver.findElement(By.xpath("//*[@id=\"14842887\"]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div[2]/h3"));
return fDButton;
}

public static WebElement Proceed2BookButton() throws Exception {
final WebElement p2bBtn= Locators.driver.findElement(By.xpath("//*[@id=\"14842887\"]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div/div/div[1]/div[2]/div[6]/button"));	
return p2bBtn;
}

public static WebElement PassengerName() throws Exception {
	String pas_name=browser.Browser.getWebEl("pname");
	final WebElement pname= driver.findElement(By.id(pas_name));
return pname;
}
//public static void main(String[] args) throws Exception {
	//System.out.println(PassengerName(Read.readExcel(0, 1)));
//}
public static WebElement PassengerGender() {
	final WebElement pgen=Locators.driver.findElement(By.id("div_22_0"));
return pgen;
}

public static WebElement PassengerAge() {
	final WebElement pAge=Locators.driver.findElement(By.id("seatno-01"));
	return pAge;
}
public static WebElement PassengerEmail() {
	final WebElement pmail=Locators.driver.findElement(By.id("seatno-05"));
	return pmail;
}

public static WebElement PassengerPhone() {
	final WebElement phone=Locators.driver.findElement(By.id("seatno-06"));
	return phone;
}
public static WebElement PassengerInsurance() {
	final WebElement insurance=Locators.driver.findElement(By.id("insuranceTNC"));
	return insurance;
}

public static WebElement NoInsurance() {
	final WebElement noInsurance=Locators.driver.findElement(By.id("insuranceNotOpted"));
	return noInsurance;
}
public static WebElement ProceedToPayButton() {
	final WebElement ptp_btn=Locators.driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[5]/div[3]/div[2]/div[2]/input"));
	return ptp_btn;
}

public static WebElement OfferCode() {
	final WebElement code=Locators.driver.findElement(By.xpath("//*[@id=\"offerCode\"]"));
	return code;
}

public static WebElement QRcode() {
	final WebElement qr=Locators.driver.findElement(By.xpath("//*[@id=\"Pay through QR code\"]"));
	return qr;
}

public static WebElement DebitCheck() {
	final WebElement db_check=Locators.driver.findElement(By.xpath("//*[@id=\"Debit Card\"]"));
	return db_check;
}

public static WebElement Card_number() {
	final WebElement db_num=Locators.driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[4]/div/div[3]/div[2]/div[2]/div[2]/div/div[1]/div[1]/div[1]/div/div/input"));
	return db_num;
}
public static WebElement Card_name() {
	final WebElement db_name=Locators.driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[4]/div/div[3]/div[2]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div/div/input"));
	return db_name;
}

public static WebElement Card_cvv() {
	final WebElement db_cvv=Locators.driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[4]/div/div[3]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div[2]/div[1]/div[2]/div/input"));
	return db_cvv;
}
public static WebElement SaveCard() {
	final WebElement save=Locators.driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[4]/div/div[3]/div[2]/div[2]/div[2]/div/div[2]/label/div"));
	return save;
}

public static WebElement Pay() {
	final WebElement pay_btn=Locators.driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[4]/div/div[3]/div[2]/div[2]/div[2]/div/div[3]/div"));
	return pay_btn;
}

public static WebElement Card_expiryDate_month() {
	final WebElement month=Locators.driver.findElement(By.xpath("//*[@id=\"react-select-2-input\"]"));
	return month;
}

public static WebElement Card_expiryDate_year() {
	final WebElement year=Locators.driver.findElement(By.xpath("//*[@id=\"react-select-3-input\"]"));
	return year;
}

}
