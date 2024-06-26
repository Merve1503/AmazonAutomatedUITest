package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage extends BasePage{

    SearchBox searchBox;

    By cartCountLocator = By.id("nav-cart-count");
    By cartContainerLocator = By.id("nav-cart-count");
    By acceptCookiesLocator = By.id("sp-cc-accept");

    public Homepage(WebDriver driver){
        super(driver);
        searchBox = new SearchBox(driver);
    }

    public SearchBox searchBox() {
        return this.searchBox;
    }

    public boolean isProductCountUp() {
        return getCartCount() > 0;
    }

    public void goToCart() {
        click(cartContainerLocator);
    }

    private int getCartCount(){
        String count = find(cartCountLocator).getText();
        return Integer.parseInt(count);
    }

    public void setAcceptCookiesLocator(){
        if (isDisplayed(acceptCookiesLocator)){
            click(acceptCookiesLocator);
        }
    }
}
