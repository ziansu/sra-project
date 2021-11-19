public static com.arcao.geocaching4locus.fragment.dialog.NoLocationPermissionErrorDialogFragment newInstance() {
    com.arcao.geocaching4locus.fragment.dialog.NoLocationPermissionErrorDialogFragment fragment = new com.arcao.geocaching4locus.fragment.dialog.NoLocationPermissionErrorDialogFragment();
    fragment.prepareDialog(R.string.error_title, R.string.error_no_location_permission, null);
    return fragment;
}