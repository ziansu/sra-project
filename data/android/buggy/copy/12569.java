public void setPoiListAdapter(java.util.List<java.lang.String> poiList) {
    java.util.Collections.sort(poiList);
    android.widget.ArrayAdapter<java.lang.String> adapter = new android.widget.ArrayAdapter<java.lang.String>(presenter, android.R.layout.simple_list_item_1, poiList);
    pois.setAdapter(adapter);
}