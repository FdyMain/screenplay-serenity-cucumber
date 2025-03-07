package com.fdymain.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.fdymain.UI.SongDetailsUI.LBL_NAMESONG_TWO;

public class ValidateSong implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        WebElementFacade elementTitulo = LBL_NAMESONG_TWO.resolveFor(actor);

        String titulo = String.valueOf(elementTitulo.getText());
        System.out.println("titulo: "+titulo);
        String cancion= actor.recall("song");
        System.out.println("cancion: "+cancion);

        return cancion.equals(titulo);
    }

    public static Question<Boolean> assertion(){
        return  new ValidateSong();
    }
}
