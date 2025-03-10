package com.fdymain.ui;

import net.serenitybdd.screenplay.targets.Target;

public class SearchUi {

    public static Target SEARCH_INPUT = Target.the("Search input")
            .locatedBy("//*[@id='center']/yt-searchbox/div[1]/form/input");

}
