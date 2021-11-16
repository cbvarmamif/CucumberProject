package stepDefination;



import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMSteps {
    WebDriver driver;

    @Given("When I launch chrome browser")
    public void when_i_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "Browaser/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Changes performed for Git");
        System.out.println("Changes performed for Git2");
        System.out.println("Changes performed for Git3");

    }

    @When("I open orange hrm homepage")
    public void i_open_orange_hrm_homepage() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

}

// System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
//        driver = new ChromeDriver();
//  driver.get("https://opensource-demo.orangehrmlive.com/");