@java.lang.Override
public void clearMap() {
    for (org.geotools.map.FeatureLayer layer : _gtLayers) {
        layer.dispose();
        _myMap.removeLayer(layer);
    }
    _gtLayers.clear();
    _myMap = null;
}