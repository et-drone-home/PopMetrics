package stepdefinitions;

import cucumber.api.java8.En;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import static org.junit.Assert.assertEquals;

public class PopSocialSteps implements En {
    EventFiringWebDriver webDriver;

    public PopSocialSteps() {

        Before(() -> {
            webDriver = new EventFiringWebDriver(new ChromeDriver());
        });

        After(() -> webDriver.close());

        Given("I'm using the Dashboard",() -> {
            webDriver.get("http://localhost:8080/");
        });

        Then("Im able to read most recent mentions", () -> {
            assertEquals("@Bryant mentioned you!", webDriver.findElements(By.id("mentions")).get(0).getText());
        });
    }
}
