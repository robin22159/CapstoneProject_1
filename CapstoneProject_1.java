// Importing the required packages and libraries
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CapstoneProject_1 {

    // Declaring the WebDriver object
    WebDriver driver;

    // Initializing the URL at the suite level
    @BeforeSuite
    public void setUp() {
        // Setting the system property for FirefoxDriver
        System.setProperty("webdriver.firefox.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");

        // Creating an instance of ChromeDriver
        driver = new FirefoxDriver();

        // Maximizing the browser window
        driver.manage().window().maximize();

        // Navigating to the Flipkart website
        driver.get("https://www.flipkart.com/");
    }

    // Creating a test case for searching and adding an item to the cart
    @Test
    public void searchAndAddItem() throws InterruptedException {
        // Creating an object of the HomePage class
        HomePage homePage = new HomePage(driver);

        // Verifying that Flipkart is present on the left side of the top
        homePage.verifyFlipkartLogo();
        
        // Closing the Login Popup
        homePage.closeLoginPopup();

        // Entering "Macbook air m2" in the search box and clicking on the search button
        homePage.searchItem("Macbook Air M2");
        
        // Adding a wait for 10 seconds using the sleep method
        TimeUnit.SECONDS.sleep(10);

        // Creating an object of the SearchResultsPage class
        SearchResultsPage searchResultsPage = new SearchResultsPage(driver);

        // Clicking on the first displayed item
        searchResultsPage.clickOnFirstItem();
        
        // Adding a wait for 10 seconds using the sleep method
        TimeUnit.SECONDS.sleep(10);

        // Switching to the new tab that opens
        driver.switchTo().window(driver.getWindowHandles().toArray()[1].toString());

        // Creating an object of the ItemDetailsPage class
        ItemDetailsPage itemDetailsPage = new ItemDetailsPage(driver);

        // Clicking on the add to cart button
        itemDetailsPage.clickOnAddToCart();
        
        // Adding a wait for 5 seconds using the sleep method
        TimeUnit.SECONDS.sleep(5);
        
        // Clicking on the add to cart button
        itemDetailsPage.cart();

        // Creating an object of the CartPage class
        CartPage cartPage = new CartPage(driver);
        
        // Adding a wait for 5 seconds using the sleep method
        TimeUnit.SECONDS.sleep(5);

        // Verifying that the item has been added to the cart successfully
        cartPage.verifyItemAdded();
    }

    // Closing the browser after the suite execution
    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}
