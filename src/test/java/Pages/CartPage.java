package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CartPage extends BasePage{

    By productNameLocator = new By.ByCssSelector("a.a-link-normal span.a-size-base-plus");
    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean checkIfProductAdded() {
        return !getProducts().isEmpty();
    }

    private List<WebElement> getProducts() {
        return findAll(productNameLocator);
    }
}
