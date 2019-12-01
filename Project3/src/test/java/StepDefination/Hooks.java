package StepDefination;


import Cucumber.Base;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Hooks extends Base {
//LOG IN HOOKS
public WebDriver driver;
    @Before   ("@MobileTest,@WebTest") // (order=1)
    public void beforevaldiation() throws IOException {
        System.out.println("1st");
        driver= Base.getDriver();
    }


    @After    ("@MobileTest,@WebTest")//(order=0)                 //("@MobileTest")
    public void aftervaldiation()
    {
        System.out.println("last");
        driver.close();
    }

//ITEM SEARCH HOOKS
/*
    @Before   ("@WebTest")               //("@MobileTest")
    public void beforesearch() throws IOException {
        System.out.println("beforesearch");
        driver= Base.getDriver();
    }


    @After ("@WebTest")               //("@MobileTest")
    public void aftersearch()
    {
        System.out.println("aftersearch");
        driver.close();
    }*/
}
