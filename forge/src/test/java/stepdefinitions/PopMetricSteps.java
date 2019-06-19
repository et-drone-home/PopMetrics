package stepdefinitions;

import cucumber.api.java8.En;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class PopMetricSteps implements En {
    EventFiringWebDriver webDriver;
    public PopMetricSteps() {
        Before(() -> {
            webDriver = new EventFiringWebDriver(new ChromeDriver());
            webDriver.get("http://localhost:4200/");
        });

        After(() -> webDriver.close());

        Given("^I'm using the Dashboard$", () -> {

        });

        When("^I make an attack$", () -> {
        });

        Then("^my opponent loses 1 hit point$", () -> {
        });
    }
}
