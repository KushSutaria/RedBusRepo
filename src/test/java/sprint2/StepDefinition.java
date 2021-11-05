package sprint2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import browser.Browser;
import locators.Locators;
import Excel.*;
public class StepDefinition {
	
    WebDriver driver = null;
//	JavascriptExecutor executor=(JavascriptExecutor) Browser.driver;

@Given("a user is on redbus site")
public void a_user_is_on_redbus_site() throws Exception {
	
System.out.println("first step");

Browser.setDriver();						//uses the chromedriver in the Browser.java file
Browser.getUrl();							//opens the chrome tab for automation
//Browser.driver.manage().window().maximize();
System.out.println("second");

}
//JavascriptExecutor executor=(JavascriptExecutor) Browser.driver;

@When("user is booking one or more tickets")
public void user_is_booking_one_or_more_tickets() throws InterruptedException {
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

//		Thread.sleep(2000);
		//Locators.DroppingPointText().click();
		executor.executeScript("arguments[0].click()", Locators.DroppingPointText());	//Click on Dropping point text
		Locators.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	//	Thread.sleep(3000);
		//Locators.checkboxDropping().click();
		executor.executeScript("arguments[0].click()", Locators.checkboxDropping());	//Click on the drop point location
		System.out.println("done");

		//Page1.method1();
	}
	catch (Exception e) {
			System.out.println(e);
	}
}

@Then("user is able to book them")
public void user_is_able_to_book_them() {
	try {
			System.out.println("user is able to");
	}
	catch (Exception e) {
			System.out.println(e);
	}

}


@When("user clicks on {string} button")
public void user_clicks_on_button(String string) {
	try {
			Locators.fareDetails().click();							//Shows the fare details of the trip
			System.out.println("user clicks on show fare details");
	}
	catch (Exception e) {
			System.out.println(e);
	}
}

@Then("the browser displays fare details")
public void the_browser_displays_fare_details() {
	try {
			System.out.println("Fare is: $x");
	}
	catch (Exception e) {
			System.out.println(e);
	}
}

@And("user is filling passenger details form")
public void user_is_filling_passenge_details_form() throws Exception {
	try {
		System.out.println("user is filling the form...");
		JavascriptExecutor executor=(JavascriptExecutor) Browser.driver;
		executor.executeScript("arguments[0].click()", Locators.Proceed2BookButton());		//Clicks on proceed to book button
		//Locators.Proceed2BookButton().click();
		Locators.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//	Thread.sleep(3000);
		Locators.PassengerName().sendKeys(Read.readExcel(0, 1));			//Reads passenger name from excel file and sends it in passenger name textbox
		Locators.PassengerGender().click();
		Locators.PassengerAge().sendKeys(Read.readExcel(1, 1));				//Reads passenger age from excel file and sends it in passenger age textbox
		Locators.PassengerPhone().sendKeys(Read.readExcel(3, 1));			//Reads passenger phone num from excel file and sends it in passenger phone number textbox
		Locators.PassengerEmail().sendKeys(Read.readExcel(2, 1));			//Reads passenger email from excel file and sends it in passenger name textbox
		Locators.NoInsurance().click();										//opts for no insurance radio button
		System.out.println("form filled");
	}
	catch (Exception e) {
			System.out.println(e);
	}
}

@When("user clicks on a Proceed to pay button")
public void user_clicks_on_a_proceed_to_pay_button() {
	try {
			System.out.println("user filled the form with correct info");
			System.out.println(Locators.ProceedToPayButton().getText());
			JavascriptExecutor executor=(JavascriptExecutor) Browser.driver;
			//Locators.passengerFormCrossbutton().click();
			//executor.executeScript("arguments[0].click()", Locators.passengerFormCrossbutton());
			//Thread.sleep(1000);
			executor.executeScript("arguments[0].click()", Locators.ProceedToPayButton()); //Clicks on proceed to pay button
			//Locators.ProceedToPayButton().click();
			System.out.println("user clicked on proceed to pay");
	}
	catch (Exception e) {
			System.out.println(e);
	}
	
}

@Then("user is redirected to payment page")
public void user_is_redirected_to_payment_page() {
	try {
			System.out.println("user is on payment page");
	}
	catch (Exception e) {
			System.out.println(e);
	}
}

@When("user opts for insurance in passengers details form")
public void user_opts_for_insurance_in_passengers_details_form() {
	try {
			Locators.PassengerInsurance().click();			//Selects insurance radio button
			System.out.println("insurance checked!");
	}
	catch (Exception e) {
			System.out.println(e);
	}
}

@Then("insurance amount will be added to the total amount")
public void insurance_amount_will_be_added_to_the_total_amount() {
	try {
			System.out.println("Insurance amount added");
	}
	catch (Exception e) {
			System.out.println(e);
	}
}


@And("is on payment page")
public void is_on_payment_page() {
	try {
			System.out.println("user is on payment page");
	}
	catch (Exception e) {
			System.out.println(e);
	}
}

@When("user enters a valid offer\\/voucher code")
public void user_enters_a_valid_offer_voucher_code() throws Exception {
	try {
			Locators.OfferCode().sendKeys(Read.readExcel(5, 1));		//Reads offer code from excel file and sends it in the offer code text box
			System.out.println("user enters voucher code");
	}
	catch (Exception e) {
			System.out.println(e);
	}
}

@Then("the user gets the respective deal or discount")
public void the_user_gets_the_respective_deal_or_discount() {
	try {
			System.out.println("User gets discount");
	}
	catch (Exception e) {
			System.out.println(e);
	}
}

@And("user is entering the card details")
public void user_is_entering_the_card_details() throws Exception {
	try {
		System.out.println("Entering card details...");
//		Thread.sleep(2000);
		Locators.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor executor=(JavascriptExecutor) Browser.driver;
		executor.executeScript("arguments[0].click()", Locators.DebitCheck());	//selects debit card option
		//Locators.DebitCheck().click();
		Locators.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		Thread.sleep(2000);
		Locators.Card_number().sendKeys(Read.readExcel(7, 1));	//reads card data from the excel sheet and sends it in the relevant text boxes
		Locators.Card_name().sendKeys(Read.readExcel(8, 1));
		Locators.Card_cvv().sendKeys(Read.readExcel(9, 1));
		Locators.Card_expiryDate_month().sendKeys(Read.readExcel(11, 1), Keys.ENTER);
		Locators.Card_expiryDate_year().sendKeys(Read.readExcel(12, 1), Keys.ENTER);
	}
	catch (Exception e) {
			System.out.println(e);
	}
}

@And("has entered the card details")
public void has_entered_the_card_details() throws Exception {
	try {
			System.out.println("Done!");
	}
	catch (Exception e) {
			System.out.println(e);
	}
}

@When("the user selects {string} button")
public void the_user_selects_button(String string) {
	try {
			JavascriptExecutor executor= (JavascriptExecutor) Browser.driver;
				executor.executeScript("arguments[0].click()", Locators.SaveCard()); //Clicks on save the card details button
	//Locators.SaveCard().click();
	}
	catch (Exception e) {
			System.out.println(e);
	}
}

@Then("the card details will be saved")
public void the_card_details_will_be_saved() {
	try {
			System.out.println("card saved");
	}
	catch (Exception e) {
			System.out.println(e);
	}
}

@When("user doesn't book the ticket in the given time")
public void user_doesn_t_book_the_ticket_in_the_given_time() throws Exception {
	try {
			System.out.println("user doesn't book ticket");
			Thread.sleep(490000);					//waits till the session times out (8+ minutes)
	}
	catch (Exception e) {
			System.out.println(e);
	}
}

@Then("the session will timeout")
public void the_session_will_timeout() {
	try {
			System.out.println("8 minutes over...");
	}
	catch (Exception e) {
			System.out.println(e);
	}
}

@And("the user will be on the main page again")
public void the_user_will_be_on_the_main_page_again() {
	try {	
			System.out.println("user is on main page");
	}
	catch (Exception e) {
			System.out.println(e);
	}
}


}
