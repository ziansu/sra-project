public void updateData(java.util.List<Device> devices) {
    javafx.application.Platform.runLater(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            observableList.clear();
            observableList.addAll(devices);
        }
    });
}