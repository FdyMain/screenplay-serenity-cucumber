package com.fdymain.tasks;

import com.fdymain.ui.TendenciesUi;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectMusicTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TendenciesUi.BTN_MUSIC)
        );
    }

    public static SelectMusicTask selectMusic() {
        return instrumented(SelectMusicTask.class);
    }
}
