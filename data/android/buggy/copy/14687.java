@com.squareup.otto.Subscribe
public void onLoginErrorEvent(me.vickychijwani.spectre.event.LoginErrorEvent event) {
    if (event.wasInitiatedByUser) {
        java.lang.String blogType = getBlogTypeFromUrl(event.blogUrl);
        me.vickychijwani.spectre.analytics.AnalyticsService.logLogin(blogType, true);
    }
}