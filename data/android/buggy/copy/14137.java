@java.lang.Override
public void onPause() {
    super.onPause();
    mapView.onPause();
    mListener.hideFabsOnMapPaused();
    Utils.SharedPreferencesUtil.SaveMapStateInSharedPrefs(getContext(), googleMap.getCameraPosition());
}