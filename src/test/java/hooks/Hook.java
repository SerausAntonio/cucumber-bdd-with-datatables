package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hook {
    WebDriver driver;
    @Before
    public void setUp(Scenario scenario){
        System.out.println(scenario.getName());
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }
    @After
    public void tearDown(Scenario scenario){

        System.out.println(scenario.getStatus());
        driver.quit();
    }
}
