public void setLocations(java.util.List<models.Location> jsonLocations) {
    for (models.Location jsonLocation : jsonLocations) {
        models.Location location = new models.Location(jsonLocation, this);
        locations.add(location);
    }
}