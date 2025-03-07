package com.fdymain.UI;

import net.serenitybdd.screenplay.targets.Target;

public class SongListUI {
    public static Target LIST_SONGS=Target.the("Lista de canciones")
            .locatedBy("//a/yt-formatted-string[@class='style-scope ytd-video-renderer']");
    public static Target LIST_SONGS_TWO=Target.the("Lista de canciones")
            .locatedBy("//*[@id='video-title']");
}
