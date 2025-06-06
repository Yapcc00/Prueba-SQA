package co.sqasa.Steps;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.pages.PageObject;


public class Navegacion extends PageObject {

    @Step("Abrir la página principal")
    public void abrirPaginaPrincipal() {
        openUrl("https://www.floristeriamundoflor.com/");
    }
}