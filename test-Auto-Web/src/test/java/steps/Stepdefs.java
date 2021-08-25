package steps;

import javafx.beans.value.ObservableFloatValue;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.By.*;


public class Stepdefs {
    @Test
// Driver do Chrome - Driver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ipinheir\\IdeaProjects\\test-Auto-Web\\Driver\\Chrome\\chromedriver.exe");
        ChromeDriver navegador = new ChromeDriver();
    public Stepdefs() {
        Given("^que estou na página home do site do Julio$", () -> {
            ObservableFloatValue navegador;
            navegador.get("https://www.juliodelima.com.br/taskit"); // Abrir navegador
        });
        And("^acesso o link take it$", () -> {
            navegador.findElement(linkText("Task it!")).click(); // Clicar no task It redirecionar para outra página
        });
        And("^clico no botão sign in$", () -> {
            navegador.findElement(linkText("Sign in")).click();
        });
        And("^informo os dados de acesso <usuerio> e <senha>$", () -> {
            navegador.findElement(id("signinbox")).findElement(name("login")).sendKeys("isabele");
            navegador.findElement(id("signinbox")).findElement(name("password")).sendKeys("1234");
        });
        When("^clico no botão SIGN IN$", () -> {
            navegador.findElement(linkText("SIGN IN")).click();
        });
        Then("^será exibido o comprimento \"([^\"]*)\"\\.$", (String arg0) -> {
            String saudacao = navegador.findElement(By.className("me")).getText();
            Assert.assertEquals("Hi,Isabele", saudacao);
        });
    }
}
