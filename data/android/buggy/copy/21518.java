public static void resetEvents() {
    synchronized(com.aimbrain.androidsdk.library.EventStore.sync) {
        if ((com.aimbrain.androidsdk.library.EventStore.eventList) == null) {
            com.aimbrain.androidsdk.library.EventStore.eventList = new org.json.JSONArray();
        }
    }
}