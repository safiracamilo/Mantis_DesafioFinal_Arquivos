package br.com.mantis;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {

   // 1.Mapamento
    WebDriver driver;
    By name = By.xpath("//tbody/tr[2]/td[2]/input[1]");
    By password = By.xpath("//tbody/tr[3]/td[2]/input[1]");
    By botao = By.xpath("//tbody/tr[6]/td[1]/input[1]");

    // 2.Construtor
    public Login(WebDriver driver){
        this.driver = driver;
    }

    public void Escrever(){

        driver.findElement(name).sendKeys("safira.camilo");
        driver.findElement(password).sendKeys("Mantis2022@");
    }

    public void Click(){
        driver.findElement(botao).click();

        String URL = driver.getCurrentUrl();
        Assert.assertEquals(URL,"https://mantis-prova.base2.com.br/my_view_page.php");

    }

}





