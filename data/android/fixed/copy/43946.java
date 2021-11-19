public void onGeotagCreated(com.krabslite.geotagger.models.Geotag tag) {
    addGeotagMarker(tag);
    adapter.notifyDataSetChanged();
}