public void onEvent(java.lang.Object event) {
    if (event instanceof org.tribler.android.restapi.json.EventsStartEvent) {
        runOnUiThread(() -> {
            progressBar.setVisibility(View.GONE);
        });
    }
}