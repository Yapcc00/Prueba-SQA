package co.sqasa.stepDefinitions;

import co.sqasa.Steps.Navegacion;
import co.sqasa.Steps.SeleccionarArticuloStep;
import io.cucumber.java.en.*;
import net.serenitybdd.annotations.Steps;


public class CategoriaAmor {

    @Steps
    Navegacion navegacion;

    @Steps
    SeleccionarArticuloStep seleccionarArticuloStep;

    @Given("^que el usuario ingresa a la pagina principal de Floristeria Mundo Flor$")
    public void queElUsuarioIngresaALaPaginaPrincipalDeFloristeriaMundoFlor() {
        navegacion.abrirPaginaPrincipal();
    }

    @When("accede a la seccion Amor desde el menu de categorias")
    public void accede_a_la_seccion_amor_desde_el_menu_de_categorias() {
        seleccionarArticuloStep.menuAmor();
    }

    @When("agrega el primer producto disponible al carrito")
    public void agrega_el_primer_producto_disponible_al_carrito() {
        seleccionarArticuloStep.articuloUno();
        seleccionarArticuloStep.validarCompra();

    }

    @When("agrega un segundo producto diferente al carrito")
    public void agrega_un_segundo_producto_diferente_al_carrito() {
        seleccionarArticuloStep.productoDos();
    }

    @Then("el carrito debe reflejar un total de dos productos")
    public void el_carrito_debe_reflejar_un_total_de_dos_productos() {
        seleccionarArticuloStep.validarCantidad();

    }


}
