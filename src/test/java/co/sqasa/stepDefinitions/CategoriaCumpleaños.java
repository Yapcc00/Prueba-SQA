package co.sqasa.stepDefinitions;

import co.sqasa.Steps.Navegacion;
import co.sqasa.Steps.SeleccionarArticuloStep;
import co.sqasa.Steps.SeleccionarProductoCumpleañosStep;
import co.sqasa.pageObjects.ValidacionesPage;
import co.sqasa.utils.Espera;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Steps;
import org.fluentlenium.core.annotation.Page;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;


public class CategoriaCumpleaños {

    @Steps
    Navegacion navegacion;

    @Steps
    SeleccionarProductoCumpleañosStep seleccionarProductoCumpleanosStep;

    @Steps
    SeleccionarArticuloStep seleccionarArticuloStep;

    @Steps
    ValidacionesPage validacionesPage;

    @Given("que el usuario se encuentra en la pagina principal de Floristeria Mundo Flor")
    public void que_el_usuario_se_encuentra_en_la_pagina_principal_de_floristeria_mundo_flor() {
        navegacion.abrirPaginaPrincipal();
    }
    @When("navega a la categoria Cumpleaños")
    public void navega_a_la_categoria_cumpleaños() {
    seleccionarProductoCumpleanosStep.menuCumpleanos();
    }

    @When("selecciona un producto y lo añade al carrito")
    public void selecciona_un_producto_y_lo_añade_al_carrito() {
    seleccionarProductoCumpleanosStep.productoCumple();
    }
    @Then("el carrito debe mostrar un producto agregado")
    public void el_carrito_debe_mostrar_un_producto_agregado() {
        seleccionarArticuloStep.validarCompra();
    }
    @When("el usuario decide eliminar ese producto del carrito")
    public void el_usuario_decide_eliminar_ese_producto_del_carrito() {
    seleccionarProductoCumpleanosStep.eliminarProducto();
    }
    @Then("el carrito debe quedar vacio")
    public void el_carrito_debe_quedar_vacio() {
        validacionesPage.validarCarritoVacioConEspera(getDriver());
    }

}
