package com.fdymain.stepDefinitions.hooks;

import com.fdymain.tasks.OpenYoutubeTask;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CommonSteps {

    @CastMember
    Actor fdy;

    @Given("el usuario abre la url de youtube")
    public void abrirUrlYoutube() {
        fdy.attemptsTo(OpenYoutubeTask.openBrowser());
        //theActorCalled("User").wasAbleTo(OpenYoutubeTask.openBrowser());
    }

}