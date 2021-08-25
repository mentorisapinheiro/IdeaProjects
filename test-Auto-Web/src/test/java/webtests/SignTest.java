package webtests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.By.*;

public class SignTest {

    @Test
    public void testeFazerLoginTaskit(){

// Driver do Chrome - Driver
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ipinheir\\IdeaProjects\\test-Auto-Web\\Driver\\Chrome\\chromedriver.exe");
 ChromeDriver navegador = new ChromeDriver();

 navegador.get("https://www.juliodelima.com.br/taskit"); // Abrir navegador
 navegador.findElement(linkText("Task it!")).click(); // Clicar no task It redirecionar para outra página
 navegador.findElement(linkText("Sign in")).click();
 navegador.findElement(id("signinbox")).findElement(name("login")).sendKeys("isabele");
 navegador.findElement(id("signinbox")).findElement(name("password")).sendKeys("1234");
 navegador.findElement(linkText("SIGN IN")).click();

 String saudacao = navegador.findElement(By.className("me")).getText();
      Assert.assertEquals("Hi,Isabele", saudacao);

    }

}

