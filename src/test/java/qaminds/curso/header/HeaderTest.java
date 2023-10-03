package qaminds.curso.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import qaminds.curso.BaseTest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HeaderTest extends BaseTest {

    @Test (testName= "Validar el header de Microsoft", description = "Validar que existan los elementos del header en la pagina principal de Microsofts")

    public void validateHeader() {
        String[] menuList = {"Microsoft 365", "Teams", "Windows", "Surface", "Xbox", "Soporte"};
        WebElement menuElement = getDriver().findElement(By.cssSelector("#uhf-g-nav > ul"));
        List<WebElement> myList = menuElement.findElements(By.tagName("a"));
        //List<String> myList = menuElement.findElements(By.tagName("a")).stream().map(WebElement::getText)
        //      .collect(Collectors.toList());

        List<String> newList = new ArrayList<>();
        for (WebElement element : myList)
            newList.add(element.getText());

        boolean exist = false;
        for (int i = 0; i < menuList.length; i++) {
            for (int x = 0; x < newList.size(); x++) {
                if (newList.get(x).equals(menuList[i])) {
                    exist = true;
                }
            }

            Assert.assertTrue(exist, "El elemento " + menuList[i] + "No se encontro la pagina. ");
        }
    }
}