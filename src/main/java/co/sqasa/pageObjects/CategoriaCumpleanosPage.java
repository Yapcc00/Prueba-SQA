package co.sqasa.pageObjects;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;

public class CategoriaCumpleanosPage extends PageObject {

    private final By btncumpleanos = By.xpath("//ul[@id='primary-menu']//a[text()='Cumpleaños']");
    private final By productoCumpleanos = By.cssSelector(".title-cart");
    private final By btnEliminar = By.xpath("(//td[@class='product-remove']/a[@class='remove'])[1]");

    public By getBtnEliminar() {
        return btnEliminar;
    }

    public By getBtncumpleanos() {
        return btncumpleanos;
    }


    public WebElementFacade getProductoCumpleanos() {
        return find(productoCumpleanos);
    }
}
