package co.sqasa.utils;

import co.sqasa.pageObjects.CategoriaAmorPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.fluentlenium.core.annotation.Page;

public class hover extends PageObject {
    @Page
    CategoriaAmorPage categoriaAmorPage;

    public void hacerHoverSobreElemento(WebElementFacade floresUno) {
        withAction().moveToElement(categoriaAmorPage.getFloresUno()).perform();
    }
}