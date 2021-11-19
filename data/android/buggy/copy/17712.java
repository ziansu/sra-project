public at.oad.trec.model.Country getSelectedCountry() {
    if ((selectedCountry) == null) {
        DatabaseManager.INSTANCE.getCountry(235);
    }
    DatabaseManager.INSTANCE.refreshObject(selectedCountry);
    return selectedCountry;
}