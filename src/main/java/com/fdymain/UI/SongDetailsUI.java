package com.fdymain.UI;

import net.serenitybdd.screenplay.targets.Target;

public class SongDetailsUI {
    public static Target LBL_NAMESONG=Target.the("titulo de la canción")
            .locatedBy("//h1/yt-formatted-string[@class='style-scope ytd-watch-metadata']");

    public static Target LBL_NAMESONG_TWO=Target.the("titulo de la canción 2")
            .locatedBy("//*[@id='title']/h1/yt-formatted-string");
}
