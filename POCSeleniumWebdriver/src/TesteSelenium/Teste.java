package testeselenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.junit.Test;
import java.util.*;

public class Teste {
    
    private WebDriver driver;
  static private Map<String, Object> vars;
  static JavascriptExecutor js;
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
  static public void testGoogleSearch() throws InterruptedException {
    // Especificar o local do ChromeDriver.
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ze\\Documents\\Projetos\\SeleniumDemo\\src\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
    
    
    driver.get("http://www.mogidascruzes.sp.gov.br/");
    driver.manage().window().setSize(new Dimension(1376, 744));
    driver.findElement(By.cssSelector(".dropdown:nth-child(3) > .dropdown-toggle")).click();
    driver.findElement(By.linkText("- Receitas e Despesas")).click();
    
    // vars.put("win855", waitForWindow(2000));
    driver.switchTo().window(vars.get("win855").toString());
    
    
    driver.findElement(By.id("cbSelView")).click();
    WebElement dropdown = driver.findElement(By.id("cbSelView"));
    
    dropdown.findElement(By.xpath("//option[. = 'Remuneração - Vencimentos']")).click();
    driver.findElement(By.cssSelector("option:nth-child(11)")).click();
    driver.findElement(By.id("inputI11")).click();
    driver.findElement(By.id("inputI11")).sendKeys("2019");
    driver.findElement(By.id("ibPesquisarTexto")).click();
    
    
    
    
    //---------------------------------------------------------------------------------
    driver.get("http://www.google.com/");
    Thread.sleep(5000);  
    WebElement searchBox = driver.findElement(By.name("q"));
    searchBox.sendKeys("Fatec Mogi das Cruzes");
    searchBox.submit();
    Thread.sleep(5000);  
    //driver.quit();
    
    
    
    
  }
  
  public static void main(String []args) throws InterruptedException{
  
 testGoogleSearch();
 
 TesteSelenium.testePrefeituraMogi();
  }
  
  
}