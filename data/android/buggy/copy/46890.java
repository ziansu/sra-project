public void finishRefreshing() {
    currentStatus = com.example.administrator.pulltorefreshtestmyself.RefreshableView.STATUS_REFRESH_FINISHED;
    preferences.edit().putLong(((com.example.administrator.pulltorefreshtestmyself.RefreshableView.UPDATED_AT) + (mId)), java.lang.System.currentTimeMillis()).apply();
    new com.example.administrator.pulltorefreshtestmyself.RefreshableView.HideHeaderTask().execute();
}