package Cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {
    public static WebDriver driver;
    public static Properties prop;

    public static WebDriver getDriver() throws IOException
    {
        prop=new Properties();
        FileInputStream fis=new FileInputStream("src\\test\\java\\Cucumber\\Global");

        prop.load(fis);

      //  C:\\Users\\tommi\\Documents\\Downloads\\crom\\chromedriver.exe"

        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\Drivers\\chromedriver.exe");
      //  "C:\\Users\\tommi\\Downloads\\chromedriver_win32\\chromedriver.exe")
        driver=new ChromeDriver();

        driver.get(prop.getProperty("url"));
        return driver;

    }

}
