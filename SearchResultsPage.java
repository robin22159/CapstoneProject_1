import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

// Class for the search results page of Flipkart
public class SearchResultsPage {

    // Declaring the WebDriver object
    WebDriver driver;

    // Declaring and locating the web elements on the search results page
    By firstItem = By.xpath("(//img[@class='_396cs4'])[1]");

    // Creating a constructor for initializing the driver object
    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method for clicking on the first displayed item
    public void clickOnFirstItem() {
        driver.findElement(firstItem).click();
    }
}

