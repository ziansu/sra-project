public void setPlacesIds(java.util.ArrayList<java.lang.String> placesIds) {
    PLACES = placesIds;
    initializeDataset();
    loadData();
    doTraining();
}