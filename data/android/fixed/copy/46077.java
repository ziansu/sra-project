public void setLocations(java.util.List<models.Location> jsonLocations) {
    if (jsonLocations == null)
        return ;
    
    for (models.Location jsonLocation : jsonLocations) {
        models.Location location = new models.Location(jsonLocation, this);
        locations.add(location);
    }
}