@java.lang.Override
public void onClick(boolean b) {
    openHTMLPage(config.guideHtmlPath);
    if ((config.analytics) != null) {
        config.analytics.logUiEvent(config.logUiEventName, getString(R.string.egab_guide));
    }
}