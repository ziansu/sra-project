private java.util.List<com.google.android.gms.awareness.state.BeaconState.TypeFilter> setupAttachements() {
    java.util.List<com.google.android.gms.awareness.state.BeaconState.TypeFilter> BEACON_TYPE_FILTERS = java.util.Arrays.asList(BeaconState.TypeFilter.with(getString(R.string.Namespace), getString(R.string.Type)));
    return BEACON_TYPE_FILTERS;
}