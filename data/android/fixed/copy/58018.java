@java.lang.Override
public void handle(@android.support.annotation.NonNull
de.westnordost.osmapi.map.data.Element element, @android.support.annotation.Nullable
de.westnordost.streetcomplete.data.osm.ElementGeometry geometry) {
    if (geometry != null) {
        housenumberCoords.add(de.westnordost.streetcomplete.util.JTSConst.toPoint(geometry.center));
    }
}