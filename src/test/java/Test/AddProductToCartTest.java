package Test;

import Pages.CartPage;
import Pages.Homepage;
import Pages.ProductDetailPage;
import Pages.ProductsPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class AddProductToCartTest extends BaseTest{

    Homepage homepage;
    ProductsPage productsPage;
    ProductDetailPage productDetailPage;
    CartPage cartpage;


    @Test
    @Order(1)
    public void search_a_product(){
        homepage = new Homepage(driver);
        homepage.setAcceptCookiesLocator();
        productsPage = new ProductsPage(driver);
        homepage.searchBox().search("Laptop");
        Assertions.assertTrue(productsPage.isOnProductPage(),
                "Not on products page!");
    }

    @Test
    @Order(2)
    public void select_a_product(){
        productDetailPage = new ProductDetailPage(driver);
        productsPage.selectProduct(10);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage(),
                "Not on product detail page!");
    }

    @Test
    @Order(3)
    public void add_product_to_cart(){
        productDetailPage.addToCart();
        Assertions.assertTrue(homepage.isProductCountUp(),
                "Product count did not increase!");
    }

    @Test
    @Order(4)
    public void go_to_cart(){
        cartpage = new CartPage(driver);
        homepage.goToCart();
        Assertions.assertTrue(cartpage.checkIfProductAdded(),
                "Product was not added to cart!");

    }
}
