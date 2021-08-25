package tests;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.seleniumhq.selenium.ChromeDriver;

public class SignTest {
 @Test
 public void testeFazerLoginNoTaskit() {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\ipinheir\\IdeaProjects\\AutomacaoBB\\Driver\\chromedriver_win32\\chromedriver.exe");
 WebDriver navegador;
  navegador = new ChromeDriver();


  assertEquals(1, 1);

 }
}

