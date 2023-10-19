package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MyStepdefs {
    WebDriver driver;
    @Given("User is at the login page of the application")
    public void userIsAtTheLoginPageOfTheApplication() {
        driver = new ChromeDriver();
        driver.get("https://knipselkrant-curacao.com/");
        System.out.println("I am on the login page");
    }

    @When("User login with the following username and password")
    public void userLoginWithTheFollowingUsernameAndPassword(DataTable dataTable) {
       List<List<String>> table = dataTable.asLists();
       // System.out.println(table.get(0).get(0));
       // System.out.println(table.get(0).get(1));
       // System.out.println(table.get(1).get(0));
       // System.out.println(table.get(1).get(1));
       // System.out.println(table.size());
        for (int i=0; i < table.size(); i++){
            for (int j=0; j < 2; j++){
                System.out.print(table.get(i).get(j));
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    @Then("User should be able to login")
    public void userShouldBeAbleToLogin() {
        System.out.println("I am logged in");
    }
}
