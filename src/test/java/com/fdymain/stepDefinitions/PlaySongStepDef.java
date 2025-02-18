package com.fdymain.stepDefinitions;

import com.fdymain.questions.ValidateSong;
import com.fdymain.tasks.HomeSearchTask;
import com.fdymain.tasks.OpenYoutubeTask;
import com.fdymain.tasks.SelectSongTask;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class PlaySongStepDef {

    @Managed(driver = "chrome")
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        setTheStage(new OnlineCast());
    }

    @Given("el usuario abre la url de youtube")
    public void abrirUrlYoutube() {
        theActorCalled("User").wasAbleTo(OpenYoutubeTask.openBrowser());
    }

    @When("el usuario busca una canción y selecciona aleatoreamente una canción")
    public void buscarYSeleccionarCancion() {
        theActorInTheSpotlight().attemptsTo(
                HomeSearchTask.searchSong(),
                SelectSongTask.selectSong()
        );
    }

    @Then("el usuario puede ver el título de la canción")
    public void verificarTituloCancion() {
        theActorInTheSpotlight().should(
                seeThat("La respuesta fue: ", ValidateSong.assertion(), Matchers.equalTo(true))
        );
    }

    @After
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}
