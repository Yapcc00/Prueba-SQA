package co.sqasa.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Espera {
    private WebDriver driver;

    // Constructor para inyectar el WebDriver
    public Espera(WebDriver driver) {
        this.driver = driver;
    }

    // Método reutilizable para espera implícita
    public void aplicarEsperaImplicita(int segundos) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(segundos));
        System.out.println("Esperando implícitamente por " + segundos + " segundos.");
    }
}
