private boolean isLand(de.fhpotsdam.unfolding.data.PointFeature earthquake) {
    boolean isLand = false;
    for (de.fhpotsdam.unfolding.marker.Marker country : countryMarkers) {
        isLand = isInCountry(earthquake, country);
    }
    return isLand;
}