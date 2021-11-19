public void initializeWriting() throws java.io.IOException {
    if ((downloadProgressNotificationHandler) != null) {
        sequentialTaskExecutor.submit(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                downloadProgressNotificationHandler.started(resourceID, storeName, downloadManager);
            }
        });
    }
}