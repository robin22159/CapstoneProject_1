import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Class for the item details page of Flipkart
public class ItemDetailsPage {

    // Declaring the WebDriver object
    WebDriver driver;

    // Declaring and locating the web elements on the item details page
    By addToCartButton = By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']");
    By cart = By.xpath("//a[@class='_3SkBxJ']");

    // Creating a constructor for initializing the driver object
    public ItemDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method for clicking on the add to cart button
    public void clickOnAddToCart() {
        driver.findElement(addToCartButton).click();
    }
    
    // Method for clicking on cart button
    public void cart() {
        driver.findElement(cart).click();
    }
}
