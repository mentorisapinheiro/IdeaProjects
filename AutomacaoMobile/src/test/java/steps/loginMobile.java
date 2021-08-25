package steps;

import driverFactory.DriverFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;

import java.awt.font.ShapeGraphicAttribute;

public class loginMobile extends DriverFactory {

  @Before
    public void inicializaDriver()
    {
      iniciarDriver();
    }

    @Dado("que eu clico em registro")
    public void que_eu_clico_em_registro() {
     System.out.println("acessou");
       pegaDriver().findElement(MobileBy.id("btnRegister")).click();

  }

    @E("eu realizo o registro")
    public void eu_realizo_o_registro() {

        pegaDriver().findElement(MobileBy.id("etNewName")).sendKeys("isabele"); // informa o nome do usuário
        pegaDriver().findElement(MobileBy.id("etNewPassword")).sendKeys("123");   // informa a senha do usuário
        pegaDriver().findElement(MobileBy.id("etNewEmail")).sendKeys("isabele@isa.com");   // confima a senha do usuário
        pegaDriver().findElement(MobileBy.id("btnNewRegister")).click();    // clica no botão criate (criar)
        pegaDriver().navigate().back();

    }

    @Quando("realizo o login no aplicativo")
    public void realizo_o_login_no_aplicativo() {
        pegaDriver().findElement(MobileBy.id("etEmail")).sendKeys("isabele"); // INFORMO O USUÁRIO CADASTRADO
        pegaDriver().findElement(MobileBy.id("etPassword")).sendKeys("12345"); // INFORMA A SENHA CADASTRADA
        pegaDriver().findElement(MobileBy.id("btnLogin")).click();  // CLICA NO BOTÃO LOGIN
    }

    @Entao("sou redirecionado para a tela principal")
    public void sou_redirecionado_para_a_tela_principal() {
        Assert.assertEquals("You have sucessfully logged in :)",pegaDriver().findElement(MobileBy.id("textView9")).getText());

    }
    @After
    public void limpaSessaoAppium(){
        pegaDriver().quit();
    }

}
