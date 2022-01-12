@java.lang.Override
public void onDestroy() {
    if ((com.mobile.myweather.app.WeatherMapActivity.mPlayer) != null) {
        com.mobile.myweather.app.WeatherMapActivity.mPlayer.stop();
    }
    super.onDestroy();
    mapView.onDestroy();
}