public void setPlace(com.hypertrack.lib.models.Place place) {
    this.place = place;
    io.hypertrack.sendeta.store.SharedPreferenceManager.setPlace(place);
    io.hypertrack.sendeta.store.SharedPreferenceManager.setShortcutPlace(place);
}