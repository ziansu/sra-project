protected void onPostExecute(java.lang.Integer loaderId) {
    if (isAdded()) {
        getLoaderManager().restartLoader(loaderId, null, this);
    }
}