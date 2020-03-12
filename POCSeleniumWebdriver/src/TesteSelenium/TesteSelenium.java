/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteSelenium;

// Generated by Selenium IDE
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import java.util.*;
import java.net.*;

public class TesteSelenium {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
  }
  @Test
  public void testePrefeituraMogi() {
    driver.get("http://www.mogidascruzes.sp.gov.br/");
    driver.manage().window().setSize(new Dimension(1376, 744));
    driver.findElement(By.cssSelector(".dropdown:nth-child(3) > .dropdown-toggle")).click();
    vars.put("window_handles", driver.getWindowHandles());
    driver.findElement(By.linkText("- Receitas e Despesas")).click();
    vars.put("win855", waitForWindow(2000));
    driver.switchTo().window(vars.get("win855").toString());
    driver.findElement(By.id("cbSelView")).click();
    {
      WebElement dropdown = driver.findElement(By.id("cbSelView"));
      dropdown.findElement(By.xpath("//option[. = 'Remuneração - Vencimentos']")).click();
    }
    driver.findElement(By.cssSelector("option:nth-child(11)")).click();
    driver.findElement(By.id("inputI11")).click();
    driver.findElement(By.id("inputI11")).sendKeys("2019");
    driver.findElement(By.id("ibPesquisarTexto")).click();
  }
   
}

//public class TesteSelenium {
    
//}