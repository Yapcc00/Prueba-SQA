package co.sqasa.Steps;

import co.sqasa.pageObjects.CategoriaCumpleanosPage;
import co.sqasa.utils.hover;
import net.serenitybdd.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class SeleccionarProductoCumpleañosStep {

    @Page
    CategoriaCumpleanosPage categoriaCumpleanosPage;

    @Page
    hover hover;


    @Step("Seleccionar Menu cumpleaños")
    public void menuCumpleanos() {
        categoriaCumpleanosPage.getDriver().findElement(categoriaCumpleanosPage.getBtncumpleanos()).click();
    }

    @Step("Seleccionar producto cumpleaños")
    public void productoCumple() {
        hover.hacerHoverSobreElemento(categoriaCumpleanosPage.getProductoCumpleanos());
        categoriaCumpleanosPage.getProductoCumpleanos().click();
    }

    @Step("Eliminar producto")
    public void eliminarProducto(){
        categoriaCumpleanosPage.getDriver().findElement(categoriaCumpleanosPage.getBtnEliminar()).click();
    }
}
