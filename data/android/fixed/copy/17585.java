private java.util.ArrayList<waterloo.com.core.LocationData> populateParkingData(int vehicle) {
    java.util.ArrayList<waterloo.com.core.LocationData> temp = getResponsefromServer(vehicle);
    return refineLocationData(temp);
}