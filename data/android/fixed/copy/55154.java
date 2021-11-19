protected void addMarkerToMap(com.google.android.gms.maps.model.LatLng loc, int text) {
    com.google.maps.android.ui.IconGenerator iconFactory = new com.google.maps.android.ui.IconGenerator(getActivity());
    addIcon(iconFactory, java.lang.Integer.toString(text), loc);
}