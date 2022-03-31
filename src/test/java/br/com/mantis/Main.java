package br.com.mantis;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import steps.Hooks;

public class Main{

    WebDriver driver;
    By name = By.xpath("//tbody/tr[2]/td[2]/input[1]");
    By password = By.xpath("//tbody/tr[3]/td[2]/input[1]");
    By botao = By.xpath("//tbody/tr[6]/td[1]/input[1]");

    @Test
    public void helloWord() {

        Hooks hooks = new Hooks();
        driver = hooks.iniciarMain();

        driver.navigate().to("https://mantis-prova.base2.com.br/login_page.php");
        Login login = new Login(driver);
        login.Escrever();
        login.Click();

        Menu menu = new Menu(driver);
        menu.pesquisarMenu();

        Link link = new Link(driver);
        link.verificarlink();

        Andamento andamento = new Andamento(driver);
        andamento.criarAndamento();
        andamento.validarcamposobrigatorio();
        hooks.fecharMain(driver);
    }
}
