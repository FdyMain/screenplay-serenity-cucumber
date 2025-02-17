package com.fdymain.UI;

import net.serenitybdd.screenplay.targets.Target;

public class HomeSearchUI {

    public static Target INPUT_SEARCH = Target.the("campo de búsqueda")
            .locatedBy("//*[@id='center']/yt-searchbox/div[1]/form/input");
}
