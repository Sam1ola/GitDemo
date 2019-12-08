package StepDefination;


import PageObject.HomePage;
import cucumber.api.PendingException;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.deser.ValueInstantiators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Cucumber.Base;

import java.io.IOException;


@RunWith(Cucumber.class)

public class MyStepDef extends Base {

   // public WebDriver driver;
    HomePage h;
   // CheckOutPage cp;

    @Given("^I log in to the Website$")
    public void iLogInToTheWebsite() throws IOException {

        System.out.println("log in ");
        System.out.println("log in ");
        System.out.println("log in ");
        System.out.println("new ");
        System.out.println("wew ");
        System.out.println("new ");


        
    }

    @When("^I clicked on the buy again$")
    public void i_clicked_on_the_buy_again() throws Throwable {
       // throw new PendingException();

        System.out.println("clicked on buy again1  ");
        System.out.println("clicked on buy again 2 ");
        System.out.println("clicked on buy again  22");
        System.out.println("clicked on buy again 3  ");
        System.out.println("clicked on buy again 4 ");
//New step

 System.out.println("clicked on buy again1  ");
        System.out.println("clicked on buy again 3 ");
        System.out.println("clicked on buy again  2111");
        System.out.println("clicked on buy again 4  ");
        System.out.println("clicked on buy again 5");
        System.out.println("clicked on buy again 4cccccccccccccccc  ");
        System.out.println("clickpppppppppppppppppppppppppped on buy again 5");
        System.out.println("clicked on buynnnnnnnnnnnnnnnnnnnnnnnn again 099  ");
        System.out.println("clicked on buy again 999ddddddddddddddddddddddd");

        System.out.println("clicked on buy again 4cccccccccccccccc  ");
        System.out.println("clickpppppppppppppppppppppppppped on buy again 5");
        System.out.println("clicked on buynnnnnnnnnnnnnnnnnnnnnnnn again 099  ");
        System.out.println("clicked on buy again 999ddddddddddddddddddddddd");




    }


    @Then("^The page is displayed$")
    public void thePageIsDisplayed()
    {
        System.out.println("Displayed7");
        System.out.println("Displayed8");
        System.out.println("Displayed9");
        System.out.println("Displayed7");
        System.out.println("Displayed8");
        System.out.println("Displaymmmmmmmmmed9");
        System.out.println("Displaymmmmmddddddmmmmed9");
        System.out.println("Displaymmmmmmmmmed9");
        System.out.println("Displaymmmmdddddmmmmmed9");
        System.out.println("Displaymmmmmmmmmed9");
        System.out.println("Displaymmmmdddddmmmmmed9");
        System.out.println("Displaymmmmmmmmmed9");
        System.out.println("Displaymmmmdddddmmmmmed9");
        System.out.println("Displaymmmmmmmmmed9");


        System.out.println("Displfffffffffffffayed7");
        System.out.println("Displhhhhhhhhhhhayed8");
        System.out.println("Displagggggggggggggyed9");



    }

   @Given("I click on page")
    public void iClickOnPage() {
        System.out.println("pages clicked");
    }

    @When("^I clicked on the search button$")
    public void i_clicked_on_the_search_button() throws Throwable {
        //throw new PendingException();
        System.out.println("search button ");
    }


    @Then("The page is shown")
    public void thePageIsShown() {
        System.out.println(" The page is shown  ");
    }

    @Given("^User is on Greencart Landing page$")
    public void user_is_on_greencart_landing_page() throws Throwable {
       // throw new PendingException();
       // driver= Base.getDriver();

        System.out.println("clicked on buy again 3  ");
        System.out.println("clicked on buy again 4 ");
        System.out.println("clicked on buy again 3  ");
        System.out.println("clicked on buy again 4 ");

    }

    @When("^User searched for (.+) Vegetable$")
    public void user_searched_for_vegetable(String name) throws Throwable {
       // throw new PendingException();
        h=new HomePage(driver);
        h.getSearch().sendKeys(name);
        Thread.sleep(3000);
    }

    @Then("^verify selected (.+) items are displayed in Check out page$")
    public void verify_selected_items_are_displayed_in_check_out_page(String name) throws Throwable {
        //throw new PendingException();
        Assert.assertTrue( h.getProductName().getText().contains(name));
    }

    @And("^Added items to cart$")
    public void added_items_to_cart() throws Throwable {
        //throw new PendingException();
        h.addToCart().click();
    }

    @And("^User proceeded to Checkout page for purchase$")
    public void user_proceeded_to_checkout_page_for_purchase() throws Throwable {
      //  throw new PendingException();
        driver.findElement(By.xpath("//a[@class='cart-icon']//img[contains(@class,'')]")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
    }







    @Given("^i search (.+) in eb$")
    public void i_search_in_eb(String Name) throws Throwable {
       // throw new PendingException();
        h=new HomePage(driver);
        h.getSearch2().sendKeys(Name);
    }

}
