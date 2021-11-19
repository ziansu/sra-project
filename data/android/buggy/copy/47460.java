public static void move() {
    cat.app.maps.MapOptions.osm.move();
    android.util.Log.i(cat.app.maps.MapOptions.tag, ("moved to my location=" + (cat.app.maps.MapOptions.osm.loc.myPos)));
}