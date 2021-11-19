public void onConfigurationChanged(android.content.res.Configuration config) {
    com.gigigo.ggglogger.GGGLogImpl.log("onConfigurationChanged");
    vuforiaAppSession.onConfigurationChanged();
}