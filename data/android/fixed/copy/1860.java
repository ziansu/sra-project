@java.lang.Override
public void locationSelected(org.vaadin.addons.locationtextfield.client.GeocodedLocationSuggestion suggestion) {
    E location = this.items.get(suggestion.getId());
    this.setText(suggestion.getDisplayString());
    this.fireLocationChanged(location);
}