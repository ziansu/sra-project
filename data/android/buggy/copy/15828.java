public void removeAsync(final java.lang.String url) {
    new android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void>() {
        @java.lang.Override
        protected java.lang.Void doInBackground(java.lang.Void... voids) {
            org.gdg.frisbee.android.cache.ModelCache.this.remove(url);
            return null;
        }
    }.execute();
}