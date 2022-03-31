package steps;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hooks {

    private ChromeDriver driver;

    //2. Construtor
    public Hooks(){
    }

    @Before
    public ChromeDriver iniciarMain(){
        System.setProperty("webdriver.chrome.driver", "drives/chrome99/chromedriver.exe");
        driver = new ChromeDriver();
        return  driver;
    }

    @After
    public void fecharMain(WebDriver driv){
        driv.close();
    }
}
