public java.lang.String getCountry(long ip) {
    int index = java.util.Collections.binarySearch(geoIP, ip);
    if (index == (-1))
        return null;
    
    return geoIP.get(index).countryCode;
}