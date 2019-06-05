// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
public class TestsuteTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void tC1() {
    driver.get("https://classroom.google.com/h");
    driver.manage().window().setSize(new Dimension(826, 820));
    {
      WebElement element = driver.findElement(By.cssSelector(".gb_xa"));
      Action builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Action builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.close();
  }
  @Test
  public void tC2() {
    driver.get("https://classroom.google.com/c/MTA2OTk2ODk5MzRa");
    driver.manage().window().setSize(new Dimension(826, 820));
    js.executeScript("window.scrollTo(0,0)");
    {
      WebElement element = driver.findElement(By.linkText("Пользователи"));
      Action builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.linkText("Пользователи")).click();
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Action builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.close();
  }
  @Test
  public void tC4() {
    driver.get("https://classroom.google.com/h");
    driver.manage().window().setSize(new Dimension(826, 820));
    {
      WebElement element = driver.findElement(By.cssSelector(".gb_xa"));
      Action builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Action builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".DShyMc-MTA2OTk2ODk5MzRa .R4EiSb > .onkcGd"));
      Action builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Action builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".gHz6xd:nth-child(2) .onkcGd > .YVvGBb:nth-child(1)")).click();
    js.executeScript("window.scrollTo(0,0)");
    driver.close();
  }
  @Test
  public void tc3() {
    driver.get("https://classroom.google.com/r/MTA2OTk2ODk5MzRa/sort-last-name");
    driver.manage().window().setSize(new Dimension(826, 820));
    driver.findElement(By.linkText("Лента")).click();
    driver.close();
  }
}
