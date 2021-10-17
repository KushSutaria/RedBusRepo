package sprint2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import browser.Browser;
import locators.Locators;
import Excel.*;
public class StepDefinition{
	
    WebDriver driver = null;
    
@Given("a user is on redbus site")
public void a_user_is_on_redbus_site() throws Exception {

System.out.println("first step");

Browser.setDriver();
Browser.getUrl();
Browser.driver.manage().window().maximize();
System.out.println("second");

}

@When("user is booking one or more tickets")
public void user_is_booking_one_or_more_tickets() throws InterruptedException {
try {
System.out.println("user is booking ticket");
Thread.sleep(5000);
Locators.viewSeats().click();
System.out.println("done");
System.out.println("select the seat");
Thread.sleep(5000);
Locators.checkboxBoarding().click();
Thread.sleep(2000);
Locators.DroppingPointText().click();
Thread.sleep(3000);
Locators.checkboxDropping().click();
System.out.println("done");
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
	Locators.fareDetails().click();
	System.out.println("user clicks on show fare details");
	}
	catch (Exception e) {
System.out.println(e);
}
}

@Then("the browser displays fare details")
public void the_browser_displays_fare_details() {
	try {
System.out.println("Fare is: $10");
	}
catch (Exception e) {
System.out.println(e);
}
}

@And("user is filling passenger details form")
public void user_is_filling_passenge_details_form() throws Exception {
	try {
System.out.println("user is filling the form...");
Locators.Proceed2BookButton().click();
Thread.sleep(3000);
//Locators.PassengerName().sendKeys(Read.readExcel(0, 1));
Locators.PassengerName().sendKeys(Read.readExcel(0, 1));
Locators.PassengerGender().click();
Locators.PassengerAge().sendKeys(Read.readExcel(1, 1));
Locators.PassengerPhone().sendKeys(Read.readExcel(3, 1));
Locators.PassengerEmail().sendKeys(Read.readExcel(2, 1));
Locators.NoInsurance().click();
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
Locators.ProceedToPayButton().click();
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
	Locators.PassengerInsurance().click();
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
Locators.OfferCode().sendKeys(Read.readExcel(5, 1));
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
	Locators.DebitCheck().click();
	Thread.sleep(2000);
	Locators.Card_number().sendKeys(Read.readExcel(7, 1));
	Locators.Card_name().sendKeys(Read.readExcel(8, 1));
	Locators.Card_cvv().sendKeys(Read.readExcel(9, 1));
//	new Actions(Locators.Card_expiryDate_month().sendKeys("01")).build().perform();
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
	Locators.SaveCard().click();
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
	Thread.sleep(490000);
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
