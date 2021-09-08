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
        navegador.manage().window().maximize();
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
    //    navegador.findElement(By.id("botaoLogin")).click(); parou de funcionar
        Actions actions = new Actions(navegador);
        actions.moveToElement(navegador.findElement(By.id("botaoLogin")));
        actions.click();
        actions.build().perform();
    }

    @Then("será exibido a mensagem {string}")
    public void será_exibido_a_mensagem(String string) {
         String invalido = navegador.findElement(By.xpath("//*[@id=\"formLogin\"]/div[1]/div[2]/div/div[2]")).getText();
         assertEquals("Dados inválidos, tente novamente!", invalido);
         navegador.quit();

}
 // CENÁRIO 2 - PESQUISA PRODUTO IPHONE

    @Given("que estou na tela principal da home")
    public void que_estou_na_tela_principal_da_home() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ipinheir\\IdeaProjects\\frontedWeb\\Driver\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("https://kabum.com.br/");
        navegador.manage().window().maximize();
    }
    @Given("pesquiso pelo produto Iphone")
    public void pesquiso_pelo_produto_iphone() {
        Actions actions = new Actions(navegador);
        actions.moveToElement(navegador.findElement(By.id("input-busca")));
        actions.click();
        actions.sendKeys("iphone");
        actions.build().perform();
    }
    @When("clico no botão buscar")
    public void clico_no_botão_buscar() {
        Actions actions = new Actions(navegador);
        actions.moveToElement(navegador.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[2]/button[2]")));
        actions.click();
        actions.build().perform();
// clica na barra de busca para concluir a pesquisa
        actions.moveToElement(navegador.findElement(By.cssSelector("#barraBuscaKabum > div > form > button > svg > g > path:nth-child(3)")));
        actions.click();
        actions.build().perform();

    }

    @Then("será exibido todos os Iphone da lista cadastrados")
    public void será_exibido_todos_os_iphone_da_lista_cadastrados() {
        String iphone = navegador.findElement(By.xpath("//*[@id=\"listing\"]/article/section/div[2]/div/main/div[1]/a/h2")).getText();
        assertEquals("iPhone XR 64GB Preto, 4G, Tela de 6.1, Câmera Traseira 12MP + Selfie 7MP - MH6M3BR/A",iphone);
        System.out.println("Localizou o Celular iPhone XR 64GB Preto, 4G, Tela de 6.1");
        navegador.quit();

    }

 // CENÁRIO 3 - Valida compra item no carrinho

    @Given("que escolho produto iphone xr 64gb preto, 4g, tela de {double} que está na página de {string}")
    public void que_escolho_produto_iphone_xr_64gb_preto_4g_tela_de_que_está_na_página_de(Double double1, String string) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ipinheir\\IdeaProjects\\frontedWeb\\Driver\\chromedriver.exe");
        navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        navegador.get("https://kabum.com.br/");
        navegador.manage().window().maximize();
// digitando no campo busca o produto
        Actions actions = new Actions(navegador);
        actions.moveToElement(navegador.findElement(By.id("input-busca")));
        actions.click();
        actions.sendKeys("iphone");
        actions.build().perform();
// clicando no botão
        actions.moveToElement(navegador.findElement(By.xpath("/html/body/div[4]/div[3]/div/div[2]/button[2]")));
        actions.click();
        actions.build().perform();
// clica na barra de busca para concluir a pesquisa
        actions.moveToElement(navegador.findElement(By.cssSelector("#barraBuscaKabum > div > form > button > svg > g > path:nth-child(3)")));
        actions.click();
        actions.build().perform();
        // escolhe o produto iphone
        actions.moveToElement(navegador.findElement(By.xpath("//*[@id=\"listing\"]/article/section/div[2]/div/main/div[1]/a/h2")));
        actions.click();
        actions.build().perform();
        // imforma que chegou lá
        System.out.println("Clicou no produto Iphone Imenso e caro!");
    }

    @Given("no botão {string}")
    public void no_botão(String string) {
        Actions actions = new Actions(navegador);
        actions.moveToElement(navegador.findElement(By.xpath("//*[@id=\"blocoValores\"]/div[2]/button")));
        actions.click();
        actions.build().perform();
    }

    @And("é exibida a mensagem {string}")
    public void é_exibida_a_mensagem(String string) {
        String carrinho = navegador.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/section/div/div[3]/strong")).getText();
        assertEquals("PRODUTO ADICIONADO NO CARRINHO",carrinho);
        System.out.println("PRODUTO ADICIONADO NO CARRINHO");
    }

    @When("clico no carrinho")
    public void clico_no_carrinho() {
        //    navegador.findElement(By.id("linkCarrinhoHeader")).click();
        Actions actions = new Actions(navegador);
        actions.moveToElement(navegador.findElement(By.id("linkCarrinhoHeader")));
        actions.click();
        actions.build().perform();
    }

    @Then("o produto {string} será exibido no carrinho com sucesso.")
    public void o_produto_será_exibido_no_carrinho_com_sucesso(String string) {
        // VALIDANDO ITEM EXISTENTE
        String iphone = navegador.findElement(By.id("removerTodosProdutos")).getText();
        assertEquals("REMOVER TODOS OS PRODUTOS",iphone);
        System.out.println(" BOTÃO REMOVER ITEM, OK! ");
// VALIDANDO PARA PAGAMENTO
        String botao = navegador.findElement(By.id("buttonGoToPayment")).getText();
        assertEquals("IR PARA O PAGAMENTO",botao);
        System.out.println(" BOTÃO IR PARA PAGAMENTO, OK! ");
// VALIDANDO QUANTIDADE
        String quantidade = navegador.findElement(By.xpath("//*[@id=\"sellersContainer\"]/div/div/div[1]/div[1]/div[2]/span")).getText();
        assertEquals("Quant:",quantidade);
        System.out.println("Quantidade adicionada: 1 item ");
        navegador.quit();

    }


}


