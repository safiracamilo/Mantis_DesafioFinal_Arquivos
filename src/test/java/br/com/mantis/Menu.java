package br.com.mantis;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Menu {
    //1.Mapeamento
    WebDriver driver;
    By view = By.cssSelector("table.width100:nth-child(3) tbody:nth-child(1) tr:nth-child(1) td.menu:nth-child(1) > a:nth-child(1)");
    By issues = By.xpath ("//a[contains(text(),'View Issues')]");
    By report = By.xpath("//a[contains(text(),'Report Issue')]");
    By log = By.xpath("//a[contains(text(),'Change Log')]");
    By roadmap = By.xpath("//a[contains(text(),'Roadmap')]");
    By summary = By.xpath("//a[contains(text(),'Summary')]");
    By manage = By.xpath("//a[contains(text(),'Manage')]");
    By account = By.xpath("//a[contains(text(),'My Account')]");
    By logout = By.xpath("//a[contains(text(),'Logout')]");

    //2. Construtor
    public Menu (WebDriver driver){
        this.driver = driver;
    }

public void pesquisarMenu(){
    Assert.assertEquals(driver.findElement(view).getText(),"My View");
    Assert.assertEquals(driver.findElement(issues).getText(),"View Issues");
    Assert.assertEquals(driver.findElement(report).getText(),"Report Issue");
    Assert.assertEquals(driver.findElement(log).getText(),"Change Log");
    Assert.assertEquals(driver.findElement(roadmap).getText(),"Roadmap");
    Assert.assertEquals(driver.findElement(summary).getText(),"Summary");
    Assert.assertEquals(driver.findElement(manage).getText(),"Manage");
    Assert.assertEquals(driver.findElement(account).getText(),"My Account");
    Assert.assertEquals(driver.findElement(logout).getText(),"Logout");
    }
}

