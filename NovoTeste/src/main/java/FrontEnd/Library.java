package FrontEnd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Library {

   public void AbrirNavegador(){
       System.setProperty("webdriver.driver.chrome", "C:\\Users\\ipinheir\\IdeaProjects\\NovoTeste\\Driver\\chromedriver.exe");
       WebDriver navegador = new ChromeDriver();
       navegador.get("http://google.com");

   }

}
