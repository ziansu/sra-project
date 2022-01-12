private org.json.JSONArray transformCoordinate(com.google.android.gms.maps.model.LatLng latLng) throws org.json.JSONException {
    org.json.JSONArray jsonArray = new org.json.JSONArray();
    jsonArray.put(latLng.longitude);
    jsonArray.put(latLng.latitude);
    return jsonArray;
}