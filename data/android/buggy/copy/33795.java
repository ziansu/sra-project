public void run() {
    try {
        java.lang.Thread.sleep(1000);
    } catch (java.lang.InterruptedException e) {
    }
    android.util.Log.d(com.mapswithme.maps.routing.RoutingController.TAG, "trying to continue tour");
    com.mapswithme.maps.routing.RoutingController.continueSavedTour(tourLoadedListener);
}