package com.fdymain.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SongTitleUi {

    public static Target LBL_NAME_SONG = Target.the("Name of the song")
            .locatedBy("//*[@id='title']/h1/yt-formatted-string");
}