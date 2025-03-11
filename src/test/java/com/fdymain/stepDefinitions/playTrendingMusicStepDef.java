package com.fdymain.stepDefinitions;

import com.fdymain.questions.ValidateSong;
import com.fdymain.tasks.SelectFirstSongTask;
import com.fdymain.tasks.SelectMusicTask;
import com.fdymain.tasks.SelectTendenciesTask;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class playTrendingMusicStepDef {


    @When("el usuario navega a la sección de Tendencias")
    public void elUsuarioNavegaALaSecciónDeTendencias() {
        theActorInTheSpotlight().attemptsTo(
                SelectTendenciesTask.selectTendencies()
        );
    }
    @And("el usuario selecciona la pestaña de Música")
    public void elUsuarioSeleccionaLaPestañaDeMúsica() {
        theActorInTheSpotlight().attemptsTo(
                SelectMusicTask.selectMusic()
        );

    }
    @And("el usuario da clic en la primera canción de la lista")
    public void elUsuarioDaClicEnLaPrimeraCanciónDeLaLista() {
        theActorInTheSpotlight().attemptsTo(
                SelectFirstSongTask.selectFirstSong()
        );

    }
    @Then("el usuario debe ver el título de la canción reproducida")
    public void elUsuarioDebeVerElTítuloDeLaCanciónReproducida() {
        theActorInTheSpotlight().should(
                seeThat("La respuesta es: ", ValidateSong.assertion(), Matchers.equalTo(true))
        );

    }
}
