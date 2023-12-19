package com.tutorialninja.demo.steps;

import com.tutorialninja.demo.pages.CheckOutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CheckOutTestSteps {

    @Then("User should see checkout text {string}")
    public void userShouldSeeCheckoutText(String checkOut) {
        Assert.assertEquals(new CheckOutPage().verifyCheckOutText(), checkOut, "Incorrect text");
    }

    @And("user should see customer text {string}")
    public void userShouldSeeCustomerText(String newCustomer) {
        Assert.assertEquals(new CheckOutPage().verifyTextNewCustomer(), newCustomer, "Incorrect text");
    }

    @And("User click on Guest Checkout radio button")
    public void userClickOnGuestCheckoutRadioButton() {
        new CheckOutPage().clickOnGuestCheckOutButton();
    }

    @And("User click on Continue tab")
    public void userClickOnContinueTab() {
        new CheckOutPage().clickOnContinueButtonTab();
    }

    @Then("user fill all the mandatory fields")
    public void userFillAllTheMandatoryFields() {
        new CheckOutPage().enterFirstNameIntoTheFirstNameField("Robert");
        new CheckOutPage().enterLastNameIntoTheLastNameField("Jackson");
        new CheckOutPage().enterEmailIntoTheEmailField("rjackson@gmail.com");
        new CheckOutPage().enterTelephoneIntoTheTelephoneField("07865325614");
        new CheckOutPage().enterAddressIntoTheAddress1Field("Harry Porter Road");
        new CheckOutPage().enterCityIntoTheCityField("London");
        new CheckOutPage().enterPostcodeIntoThePostCodeField("HP4 2PH");
        new CheckOutPage().enterCountryIntoTheCountryField("United Kingdom");
        new CheckOutPage().enterZoneIntoTheZoneField("Derbyshire");

    }

    @And("User click on Continue")
    public void userClickOnContinue() {
        new CheckOutPage().clickOnContinueButtonForGuest();
    }

    @And("User enter Comments about order into text field")
    public void userEnterCommentsAboutOrderIntoTextField() {
        new CheckOutPage().addCommentsAboutYourOrderIntoTheTextArea("Leave it by door please");
    }

    @And("User Click on check the Terms & Conditions check box")
    public void userClickOnCheckTheTermsConditionsCheckBox() {
        new CheckOutPage().clickOnCheckBoxForTermsAndConditions();
    }

    @And("User Click on Continues")
    public void userClickOnContinues() {
        new CheckOutPage().clickOnContinueButtonForPaymentMethod();
    }

    @Then("User should see warning message {string}")
    public void userShouldSeeWarningMessage(String warningMessage) {
        String expected = "Warning: Payment method required!\n" + "×";
        String actual = new CheckOutPage().verifyWarningMessageForPaymentMethod();
        Assert.assertEquals(expected, actual, "Not displayed");
    }
}
