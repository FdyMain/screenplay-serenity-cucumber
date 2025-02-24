package com.fdymain.tasks;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.util.EnvironmentVariables;

import static com.fdymain.utils.Constants.WEB_URL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenYoutubeTask implements Task {

    //** usar para la variable de serenity.config
    EnvironmentVariables environmentVariables = SystemEnvironmentVariables.createEnvironmentVariables();

    @Override
    public <T extends Actor> void performAs(T actor) {


        String urlWeb = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(WEB_URL);

        actor.attemptsTo(
                /*Open.browserOn().thePageNamed("pages.qa")*/
                Open.url(urlWeb)
        );

    }

    public static OpenYoutubeTask openBrowser(){

        return  instrumented(OpenYoutubeTask.class);
    }
}
