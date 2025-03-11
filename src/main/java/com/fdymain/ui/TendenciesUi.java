package com.fdymain.ui;


import net.serenitybdd.screenplay.targets.Target;

public class TendenciesUi {

    public static Target BTN_TENDENCIES = Target.the("button tendencies")
            .locatedBy("(//*[@id='items']/ytd-guide-entry-renderer/a[@title='Tendencias'])[1]");

    public static Target BTN_MUSIC = Target.the("button music")
            .locatedBy("//*[@id='tabsContent']/yt-tab-group-shape/div[1]/yt-tab-shape[2]/div[1]");
}
