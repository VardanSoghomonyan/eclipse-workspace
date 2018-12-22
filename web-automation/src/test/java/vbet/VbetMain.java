package vbet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

//import WebDriver.ClickLogin;

public class VbetMain {

	@Test
    public void vbet() throws InterruptedException {
		// Create a new instance of the Firefox driver
        // Notice that the remainder of the code relies on the interface, 
        // not the implementation.
		System.setProperty("webdriver.chrome.driver", "/Users/vardansoghomonyan/chromedriver");
        WebDriver driver = new ChromeDriver();

        // And now use this to visit Google
        driver.get("http://m.vbet.com");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");
//		ClickLogin loginOne = new ClickLogin();
//		loginOne.driverGet("http://m.vbet.com");
        // Find the text input element by its name

        WebDriverWait wait = new WebDriverWait (driver, 10);
        WebElement rightMenuIcon = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class,'login-parent-div')]/label[contains(@class,'right-top')]")));

        // Enter something to search for
        rightMenuIcon.click();
        
        WebElement loginField = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@name, 'login')]")));
        loginField.click();
        loginField.sendKeys("agafdg@adfadsf.df");
        
        WebElement passwordField = driver.findElement(By.xpath("//input[contains(@name, 'password')]"));
        passwordField.click();
        passwordField.sendKeys("Anyuta12345");
        
        WebElement loginKey = driver.findElement(By.xpath("//button[contains(@type, 'submit')]"));
        loginKey.submit();
        
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'deposit')]")));
        Thread.sleep(10000);
        

        // Check the title of the page
//        System.out.println("Page title is: " + driver.getTitle());
        
        // Google's search is rendered dynamically with JavaScript.
        // Wait for the page to load, timeout after 10 seconds
//        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
//            public Boolean apply(WebDriver d) {
//                return d.getTitle().toLowerCase().startsWith("cheese!");
//            }
//        });

        // Should see: "cheese! - Google Search"
//        System.out.println("Page title is: " + driver.getTitle());
        
        //Close the browser
        driver.quit();
    }
}
