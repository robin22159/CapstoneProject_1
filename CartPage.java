import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// Class for the cart page of Flipkart

public class CartPage {

    // Declaring the WebDriver object
    WebDriver driver;

    // Declaring and locating the web elements on the cart page
    By cartTitle = By.xpath("//div[text()='Flipkart (1)']");

    // Creating a constructor for initializing the driver object
    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method for verifying that the item has been added to the cart successfully
    public void verifyItemAdded() {
        WebElement title = driver.findElement(cartTitle);
        assert title.isDisplayed();
    }
}
