private java.lang.String getTripDistance(ms.loop.loopsdk.profile.Trip trip) {
    java.lang.Double dist = trip.getRouteDistanceInKilometers();
    java.lang.Double miles = dist * 0.621371;
    return java.lang.String.format(java.util.Locale.US, "%.2f mi.", dist, miles);
}