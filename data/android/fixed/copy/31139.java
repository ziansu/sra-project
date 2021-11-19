public void configure(java.lang.String saveLocation) {
    addMainPane();
    addSyncStatus();
    setSyncStatus("Not updated yet in this session");
    addSaveLocation();
    setSaveLocation(saveLocation);
    registerAsAnEventHandler(this);
}