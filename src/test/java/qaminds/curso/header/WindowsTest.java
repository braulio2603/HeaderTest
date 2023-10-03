package qaminds.curso.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import qaminds.curso.BaseTest;

import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class WindowsTest extends BaseTest {

    @Test(testName= "Validar el header de Microsoft", description = "Validar que existan los elementos del header en la pagina principal de Microsofts")
    public void validarHeader2(){

        WebElement winElement = getDriver().findElement(By.cssSelector("#shellmenu_2"));
        winElement.click();

        WebElement acercaWin = getDriver().findElement(By.id("c-shellmenu_48"));
        acercaWin.click();


        String[] menuList = {"Descubre Windows 11", "Comparar Windows 10 y 11", "Seguridad de Windows 11",
                "Edición de fotos y películas", "Aplicaciones", "Juegos", "Sincroniza smartphones con la computadora",
                 "Características de accesibilidad de Windows", "Sugerencias y trucos"};

        WebElement menElement = getDriver().findElement(By.cssSelector("#uhf-g-nav > ul > li:nth-child(2) > div > ul"));
        List<String> miList = menElement.findElements(By.tagName("a")).stream()
                .map(WebElement::getText)
                .collect(Collectors.toList());

        assertThat(miList).contains(menuList);
    }
}
