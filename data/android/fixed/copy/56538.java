private void startTheJob() {
    try {
        handler.deserialize(pathToDB);
    } catch (java.io.IOException e) {
        IFO.Utility.createBeginningAlert(handler, primaryStage, nonExistentFiles);
    }
    mainController.populateCollectionsListView();
}