import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// Creating a separate class for each page to track objects (XPATHs) using Page Object Model

// Class for the home page of Flipkart
public class HomePage {

    // Declaring the WebDriver object
    WebDriver driver;

    // Declaring and locating the web elements on the home page
    By flipkartLogo = By.xpath("//img[@alt='Flipkart']");
    By searchBox = By.xpath("//input[@name='q']");
    By loginPopup = By.xpath("//span[@class='_30XB9F']");

    // Creating a constructor for initializing the driver object
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Method for verifying that Flipkart is present on the left side of the top
    public void verifyFlipkartLogo() {
        WebElement logo = driver.findElement(flipkartLogo);
        assert logo.isDisplayed();
        assert logo.getLocation().getX() < driver.manage().window().getSize().getWidth() / 2;
    }
    
    // Method for verifying that Flipkart is present on the left side of the top
    public void closeLoginPopup() {
        WebElement popup = driver.findElement(loginPopup);
        assert popup.isDisplayed();
        driver.findElement(loginPopup).click();
    }

    // Method for entering an item in the search box and clicking on the search button
    public void searchItem(String item) {
        driver.findElement(searchBox).sendKeys(item);
        driver.findElement(searchBox).sendKeys(Keys.ENTER);
    }
}
