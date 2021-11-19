@java.lang.Override
public void onClick() {
    com.eggheadgames.aboutbox.share.ShareUtil.share(this);
    if ((config.analytics) != null) {
        config.analytics.logUiEvent(config.logUiEventName, getString(R.string.egab_share_log_event));
    }
}