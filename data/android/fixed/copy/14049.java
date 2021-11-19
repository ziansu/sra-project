public org.ubicompforall.CityExplorer.data.Poi getPoiAt(int idx) {
    if ((pois.size()) > 0) {
        return pois.get(idx);
    }else {
        return null;
    }
}