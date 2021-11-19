public void removeAsync(final java.lang.String url) {
    new android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void>() {
        @java.lang.Override
        protected java.lang.Void doInBackground(java.lang.Void... voids) {
            remove(url);
            return null;
        }
    }.execute();
}