package com.fdymain.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.Actor;

import static com.fdymain.ui.SongTitleUi.LBL_NAME_SONG;

public class ValidateSong implements Question<Boolean>{


    @Override
    public Boolean answeredBy(Actor actor){

        WebElementFacade elementTitle = LBL_NAME_SONG.resolveFor(actor);

        String title = String.valueOf(elementTitle.getText());
        String titleSong = actor.recall("song");

        return titleSong.equals(title);

    }

    public static Question<Boolean> assertion(){
        return new ValidateSong();
    }

}
