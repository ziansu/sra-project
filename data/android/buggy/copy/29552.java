public static boolean positionChanged(com.google.android.gms.maps.model.LatLng newPosition, com.google.android.gms.maps.model.LatLng oldPosition) {
    return (oldPosition != null) && ((com.barrybecker4.mapland.game.LocationUtil.distance(newPosition, oldPosition)) > (com.barrybecker4.mapland.game.LocationUtil.TOLERANCE));
}