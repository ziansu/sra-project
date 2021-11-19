private void setUpCountConfig() {
    com.umeng.analytics.MobclickAgent.updateOnlineConfig(this);
    com.umeng.analytics.AnalyticsConfig.enableEncrypt(true);
    com.umeng.update.UmengUpdateAgent.update(this);
}