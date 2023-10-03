package qaminds.curso.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import qaminds.curso.BaseTest;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.stream.Collectors;

    @Test(testName= "Validar el header de Microsoft", description = "Validar que existan los elementos del header en la pagina principal de Microsofts")
    public class HeaderTest3 extends BaseTest {

        public void validarHeader2(){
            String[] mList = {"Microsoft 365", "Teams", "Windows", "Surface", "Xbox", "Soporte"};
            WebElement menElement = getDriver().findElement(By.cssSelector("#uhf-g-nav > ul"));
            List<String> miList = menElement.findElements(By.tagName("a")).stream()
                    .map(WebElement::getText)
                    .collect(Collectors.toList());

            assertThat(miList).contains(mList);
        }
}
