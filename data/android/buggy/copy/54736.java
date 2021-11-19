private boolean isLand(de.fhpotsdam.unfolding.data.PointFeature earthquake) {
    for (de.fhpotsdam.unfolding.marker.Marker country : countryMarkers) {
        if (isInCountry(earthquake, country))
            return true;
        else
            return false;
        
    }
    return false;
}