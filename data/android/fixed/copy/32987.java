public void callHandler() {
    handler = new android.os.Handler();
    my_update = new com.example.clock.stopwatchActivity.updateTimer();
    handler.postDelayed(my_update, 1000);
}