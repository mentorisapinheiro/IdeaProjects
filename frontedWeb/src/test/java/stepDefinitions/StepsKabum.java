package stepDefinitions;

import static org.junit.Assert.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;


public class StepsKabum {
      WebDriver navegador;

    // Cenário1 - acesso inválido
    @Given("que estou na página principal do site {string}")
    public void queEstouNaPáginaPrincipalDoSite(String arg0){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ipinheir\\IdeaProjects\\frontedWeb\\Driver\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("https://kabum.com.br/");
     //   WebElement meuElementoDimamico = navegador.findElement(By.id("meuElementoDinamico"));
    }

    @And("clico no botão Login")
    public void clico_no_botão_login() {
        navegador.findElement(By.linkText("Login")).click();

    }

    @Given("informo os dados de acesso")
    public void informo_os_dados_de_acesso() {
        Actions actions = new Actions(navegador);

        // informa e-mail
        actions.moveToElement(navegador.findElement(By.xpath("//*[@id=\"formLogin\"]/div[1]/div[1]/div/div/label")));
        actions.click();
        actions.sendKeys("isabele@teste.com.br");
        actions.build().perform();
        // informa senha
        actions.moveToElement(navegador.findElement(By.xpath("//*[@id=\"formLogin\"]/div[1]/div[2]/div/div/div/input")));
        actions.click();
        actions.sendKeys("1232");
        actions.build().perform();

    // clica no botão Controle de privacidade Cokies
        actions.moveToElement(navegador.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[2]/button[2]")));
        actions.click();
        actions.build().perform();
    }

    @When("clico no botão Entrar")
    public void clico_no_botão_entrar() {
        navegador.findElement(By.id("botaoLogin")).click();
    }

    @Then("será exibido a mensagem {string}")
    public void será_exibido_a_mensagem(String string) {
         String invalido = navegador.findElement(By.xpath("//*[@id=\"formLogin\"]/div[1]/div[2]/div/div[2]")).getText();
         assertEquals("Dados inválidos, tente novamente!", invalido);
         navegador.quit();

}



// Cenário 2 -BUSCA PRODUTO IPHONE




// Cenário 3 - Coloca produto no carrinho













}


