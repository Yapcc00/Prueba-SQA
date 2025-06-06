package co.sqasa.pageObjects;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.annotation.Target;
import java.time.Duration;
import java.util.List;

public class ValidacionesPage extends PageObject {

    @FindBy(css = "div.woocommerce-message")
    private WebElementFacade mensajeCarrito;

    public String obtenerTextoMensajeCarrito() {
        return mensajeCarrito.getText().trim();
    }

    // Localizador para todos los productos en el carrito (filas con clase cart_item dentro del tbody)
    @FindBy(css = "tbody tr.cart_item")
    private List<WebElementFacade> productosEnCarrito;

    public void validarCantidadDeProductosEnCarrito(int cantidadEsperada) {
        int cantidadReal = productosEnCarrito.size();
        System.out.println("Cantidad de productos en carrito: " + cantidadReal);
        if (cantidadReal != cantidadEsperada) {
            throw new RuntimeException("Error: La cantidad de productos en el carrito es " + cantidadReal + ", pero se esperaba " + cantidadEsperada);
        }
    }


    public void validarCarritoVacioConEspera(WebDriver driver) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            WebElement mensaje = wait.until(ExpectedConditions.visibilityOfElementLocated(
                    By.xpath("//div[contains(@class, 'cart-empty') and contains(normalize-space(.), 'Tu carrito está vacío')]")
            ));
            System.out.println("✅ Mensaje de carrito vacío visiblee: " + mensaje.getText());
        } catch (TimeoutException e) {
            throw new AssertionError("❌ El mensaje de 'carrito vacío' no se encontró o no fue visible a tiempo.");
        }
    }




}
