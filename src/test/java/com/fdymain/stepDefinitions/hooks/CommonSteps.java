package com.fdymain.stepDefinitions.hooks;


import com.fdymain.tasks.OpenYoutubeTask;
import io.cucumber.java.en.Given;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class CommonSteps {

    @Given("el usuario abre la url de youtube")
    public void elUsuarioAbreLaUrlDeYoutube() {
        theActorCalled("User").wasAbleTo(OpenYoutubeTask.openBrowser());
    }
}