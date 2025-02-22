package com.fdymain.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenYoutubeTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://www.youtube.com/")
        );

    }

    public static OpenYoutubeTask openBrowser(){

        return  instrumented(OpenYoutubeTask.class);
    }
}
