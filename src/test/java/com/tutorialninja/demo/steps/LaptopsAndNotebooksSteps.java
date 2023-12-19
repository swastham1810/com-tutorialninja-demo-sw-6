package com.tutorialninja.demo.steps;

import com.tutorialninja.demo.pages.LaptopsAndNoteBooksPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class LaptopsAndNotebooksSteps {
    @And("User Select Sort By Price \\(High > Low)")
    public void userSelectSortByPriceHighLow() {
        new LaptopsAndNoteBooksPage().originalProductPrice();
        new LaptopsAndNoteBooksPage().sortByPriceHightoLow();
    }
    @Then("User should see Product price is arrange in High to Low order.")
    public void userShouldSeeProductPriceIsArrangeInHighToLowOrder() {
        new LaptopsAndNoteBooksPage().afterSortByPrice();
    }

    @And("User Select Product MacBook")
    public void userSelectProductMacBook() {
        new LaptopsAndNoteBooksPage().selectMacBookProduct();
    }
    @Then("User should able to verify the Product name {string}")
    public void userShouldAbleToVerifyTheProductName(String macBook) {
        Assert.assertEquals(new LaptopsAndNoteBooksPage().verifyTheTextMacBook(),
                macBook, "Incorrect message displayed!");
    }

    @And("User Click on Add To Cart button")
    public void userClickOnAddToCartButton() {
        new LaptopsAndNoteBooksPage().clickOnAddToCart();
    }
    @Then("User should see the message Success: You have added MacBook to your shopping cart!")
    public void userShouldSeeTheMessageSuccessYouHaveAddedMacBookToYourShoppingCart() {
        String expected = "Success: You have added MacBook to your shopping cart!\n" + "×";
        String actual = new LaptopsAndNoteBooksPage().verifySuccessMessageForAddingProductToShoppingCart();
        Assert.assertEquals(expected, actual, "Not displayed");
    }


    @And("User click on link shopping cart display into success message")
    public void userClickOnLinkShoppingCartDisplayIntoSuccessMessage() {
        new LaptopsAndNoteBooksPage().clickOnLinkToShoppingCartMessage();
    }

}
