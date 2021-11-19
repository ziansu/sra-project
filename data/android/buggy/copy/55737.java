@java.lang.Override
public java.util.Iterator<dyvil.tools.parsing.marker.Marker> iterator() {
    return new dyvil.collection.iterator.ArrayIterator<dyvil.tools.parsing.marker.Marker>(this.markers, this.markerCount);
}