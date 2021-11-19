public void onModuleLoad() {
    org.wwarn.mapcore.client.utils.MapLoadUtil.loadMapApi(new java.lang.Runnable() {
        public void run() {
            loadVisualisationApi();
        }
    });
}