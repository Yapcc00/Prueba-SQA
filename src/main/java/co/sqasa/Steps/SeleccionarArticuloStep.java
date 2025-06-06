package co.sqasa.Steps;

import co.sqasa.pageObjects.CategoriaAmorPage;
import co.sqasa.pageObjects.ValidacionesPage;
import co.sqasa.utils.hover;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import static org.assertj.core.api.Assertions.assertThat;
import org.openqa.selenium.WebDriver;



public class SeleccionarArticuloStep {

    WebDriver driver;

    @Page
    CategoriaAmorPage categoriaAmorPage;
    @Page
    hover hover;
    @Page
    ValidacionesPage validacionesPage;


    @Step("Seleccionar Menu Amor")
    public void menuAmor() {
        categoriaAmorPage.getDriver().findElement(categoriaAmorPage.getBtnAmor()).click();
    }

    @Step("Seleccionar Articulo")
    public void articuloUno() {
        hover.hacerHoverSobreElemento(categoriaAmorPage.getFloresUno());
        categoriaAmorPage.getFloresUno().click();

        String codigoProductoAgregado = "MDF 0001";
        String textoEsperado = "“" + codigoProductoAgregado + "” se ha añadido a tu carrito.";

        String textoReal = validacionesPage.obtenerTextoMensajeCarrito();

        assertThat(textoReal).contains(textoEsperado);


    }

    @Step("Seleccionar producto dos")
    public void productoDos() {
        categoriaAmorPage.getDriver().findElement(categoriaAmorPage.getBtnSeguirComprando()).click();
        categoriaAmorPage.getFloresDos().click();
    }

    @Step("Validacion producto")
    public void validarCompra() {
        String codigoProductoAgregado = "MDF 0001";
        String textoEsperado = "“" + codigoProductoAgregado + "” se ha añadido a tu carrito.";

        String textoReal = validacionesPage.obtenerTextoMensajeCarrito();

        assertThat(textoReal).contains(textoEsperado);

    }

    @Step("Validacion producto")
    public void validarCantidad() {
       validacionesPage.validarCantidadDeProductosEnCarrito(2);
    }
}
