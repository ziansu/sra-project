@java.lang.Override
public void onClick() {
    startActivity(new android.content.Intent(android.content.Intent.ACTION_VIEW, android.net.Uri.parse(config.webHomePage)));
    if ((config.analytics) != null) {
        config.analytics.logUiEvent(config.logUiEventName, getString(R.string.egab_website_log_event));
    }
}