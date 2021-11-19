public static int mercatorE7ToLatE7(final int mer) {
    return ((int) ((de.blau.android.util.GeoMath.mercatorToLat((mer / 1.0E7))) * 1.0E7));
}