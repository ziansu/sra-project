@java.lang.Override
protected void onStop() {
    weather.stop();
    news.stop();
    body.stop();
    commute.stop();
    super.onStop();
}