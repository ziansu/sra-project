@java.lang.Override
protected java.lang.String doInBackground(java.lang.String... urls) {
    try {
        return aman.darkgoals.UrlFetcher.downloadTextFile(urls[0]);
    } catch (java.io.IOException e) {
        return "Unable to retrieve web page. URL may be invalid.";
    }
}