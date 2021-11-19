@java.lang.Override
public void onDestroyView() {
    super.onDestroyView();
    mapView.getTileProvider().clearTileCache();
    mapView.onDetach();
}