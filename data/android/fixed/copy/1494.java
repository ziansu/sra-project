private void restartLoader() {
    getSupportLoaderManager().restartLoader(LOCATION_LOADER_ID, null, this);
}