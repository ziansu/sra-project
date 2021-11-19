private void displayGPSLocation(final int location) {
    getActivity().runOnUiThread(new java.lang.Runnable() {
        @java.lang.Override
        public void run() {
            txtGPSLocation.setText(java.lang.String.format(java.util.Locale.getDefault(), getString(R.string.gps_location_initial)));
        }
    });
}