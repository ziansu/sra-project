@java.lang.Override
public void locationSelected(org.vaadin.addons.locationtextfield.client.GeocodedLocationSuggestion suggestion) {
    this.setText(suggestion.getDisplayString());
    E location = this.items.get(suggestion.getId());
    this.fireLocationChanged(location);
}