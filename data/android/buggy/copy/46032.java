public com.ds.avare.place.Airport getAirport(int index) {
    if (index >= (com.ds.avare.storage.Preferences.MAX_AREA_AIRPORTS)) {
        return null;
    }
    return mAirports[index];
}