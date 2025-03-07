package com.fdymain.stepDefinitions;

import com.fdymain.questions.ValidateSong;
import com.fdymain.tasks.HomeSearchTask;
import com.fdymain.tasks.OpenYoutubeTask;
import com.fdymain.tasks.SelectSongTask;
import io.cucumber.java.en.*;
import org.hamcrest.Matchers;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class PlaySongStepDef {

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
}
