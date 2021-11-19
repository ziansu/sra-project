public com.ds.avare.place.Airport[] findClosestAirports(double lon, double lat) {
    return dbHelper.findClosestAirports(lon, lat);
}