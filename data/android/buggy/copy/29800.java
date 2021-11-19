protected void onPostExecute(java.lang.String[] movies) {
    adapter.clear();
    for (java.lang.String movie : movies) {
        adapter.add(movie);
    }
}