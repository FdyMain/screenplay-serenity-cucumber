package com.fdymain.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SongListUi {

    public static Target LIST_SONGS = Target.the("List of songs")
            .locatedBy("//*[@id='video-title']/yt-formatted-string");
}
