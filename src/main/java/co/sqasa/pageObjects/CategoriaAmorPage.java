package co.sqasa.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CategoriaAmorPage extends PageObject {

    private final By btnAmor = By.xpath("(//a[@href='https://www.floristeriamundoflor.com/product-category/amor/'])[3]");
    private final By btnAddCarrito = By.cssSelector(".title-cart");
    private final By btnSeguirComprando = By.cssSelector(".woocommerce-message a.button.wc-forward");

    private final By floresUno = By.xpath("//a[@aria-label='Añadir al carrito: “MDF 0001”']");
    private final By floresDos = By.xpath("//a[@aria-label='Añadir al carrito: “MDF 00012”']");
    private final By logo = By.cssSelector(".logo-in-theme pull-left");

    public By getLogo() {
        return logo;
    }

    public By getBtnAmor() {
        return btnAmor;
    }

    public By getBtnAddCarrito() {
        return btnAddCarrito;
    }

    public WebElementFacade  getFloresDos() {
        return find(floresDos);
    }

    public By getBtnSeguirComprando() {
        return btnSeguirComprando;
    }

    public WebElementFacade getFloresUno() {
        return find(floresUno);
    }


}
