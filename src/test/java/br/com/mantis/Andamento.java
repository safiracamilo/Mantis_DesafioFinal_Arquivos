package br.com.mantis;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


public class Andamento {

    //1.Mapeamento

    WebDriver driver;
    By report = By.xpath("//a[contains(text(),'Report Issue')]");
    By chooseProject = By.xpath("//tbody/tr[2]/td[2]/select[1]");
    By selectProject = By.xpath("//tbody/tr[4]/td[1]/input[1]");
    By category = By.xpath("//tbody/tr[2]/td[2]/select[1]");
    By summary = By.xpath("//tbody/tr[9]/td[2]/input[1]");
    By description = By.xpath(("//tbody/tr[10]/td[2]/textarea[1]"));
    By submitReport = By.xpath("//tbody/tr[16]/td[2]/input[1]");
    By applicationError = By.xpath("//td[contains(text(),'APPLICATION ERROR #11')]");
    By myView = By.xpath(("//a[contains(text(),'My View')]"));

    //2. Construtor
    public Andamento(WebDriver driver){
        this.driver = driver;
    }

    public void criarAndamento(){

        driver.findElement(report).click();

        Select select = new Select(driver.findElement(chooseProject)); // combobox
        select.selectByVisibleText("Tesrt"); // escolhando a opcao do combobox
        driver.findElement((selectProject)).click(); // click para escolher o combobox

        Select projects = new Select(driver.findElement(category)); // combobox
        projects.selectByVisibleText("[All Projects] Teste"); // escolhando a opcao do combobox
        driver.findElement((category)).click(); // click para escolher o combobox

        driver.findElement(summary).sendKeys("base dados teste");
        driver.findElement(description).sendKeys("base dados teste");
        driver.findElement(submitReport).click();

        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL, "https://mantis-prova.base2.com.br/bug_report.php");
    }

    public void validarcamposobrigatorio(){
    driver.findElement(report).click();
    driver.findElement(submitReport).click();
    Assert.assertEquals(driver.findElement(applicationError).getText(),"APPLICATION ERROR #11");
    }


}


