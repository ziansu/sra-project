public static com.android.volley.RequestQueue getRequestQueue() {
    if ((com.aspsine.swipetoloadlayout.demo.App.sRequestQueue) == null) {
        com.aspsine.swipetoloadlayout.demo.App.sRequestQueue = com.android.volley.toolbox.Volley.newRequestQueue(com.aspsine.swipetoloadlayout.demo.App.sContext);
    }
    return com.aspsine.swipetoloadlayout.demo.App.sRequestQueue;
}