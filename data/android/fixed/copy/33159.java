public static de.hsmainz.pubapp.geocoder.httpapirequest.HttpAPIRequest createRequest(java.lang.String type) {
    de.hsmainz.pubapp.geocoder.httpapirequest.HttpAPIRequest returnValue;
    if ("graphhopper".equalsIgnoreCase(type)) {
        returnValue = new de.hsmainz.pubapp.geocoder.httpapirequest.HttpGraphhopperRequest();
    }else {
        returnValue = new de.hsmainz.pubapp.geocoder.httpapirequest.HttpNominatimRequest();
    }
    return returnValue;
}