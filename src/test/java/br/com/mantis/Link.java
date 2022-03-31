package br.com.mantis;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Link {
    //1.Mapeamento (encontrando elementos)
    WebDriver driver;

    By issues = By.xpath ("//a[contains(text(),'View Issues')]");
    By advanced = By.xpath("//tbody/tr[1]/td[2]/span[1]/a[1]");
    By report = By.xpath("//a[contains(text(),'Report Issue')]");
    By project = By.xpath("//body[1]/div[2]/form[1]/table[1]/tbody[1]/tr[1]/td[1]");
    By summary = By.xpath("//a[contains(text(),'Summary')]");
    By date = By.xpath("//td[contains(text(),'By Date (days)')]");
    By manage = By.xpath("//a[contains(text(),'Manage')]");
    By siteInformation = By.xpath("//td[contains(text(),'Site Information')]");
    By account = By.xpath("//a[contains(text(),'My Account')]");
    By editAccount = By.xpath("//td[contains(text(),'Edit Account')]");

    //2.Construtor
    public Link(WebDriver driver){

        this.driver = driver;
    }

    public  void verificarlink(){

        driver.findElement(issues).click();
        Assert.assertEquals(driver.findElement(advanced).getText(),"Advanced Filters");
        driver.findElement(report).click();
        Assert.assertEquals(driver.findElement(project).getText(),"Select Project");
        driver.findElement(summary).click();
        Assert.assertEquals(driver.findElement(date).getText(),"By Date (days)");
        driver.findElement(manage).click();
        Assert.assertEquals(driver.findElement(siteInformation).getText(),"Site Information");
        driver.findElement(account).click();
        Assert.assertEquals(driver.findElement(editAccount).getText(),"Edit Account");
    }
}


