public void setGMapType(int mapType) {
    if (mapType == (nl.rsdt.japp.jotial.maps.wrapper.JotiMap.GOOGLEMAPTYPE)) {
        googleMap.setMapType(mapType);
    }else {
        throw new java.lang.RuntimeException("only supported for googleMaps");
    }
}