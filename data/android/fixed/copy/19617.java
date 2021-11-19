protected void onPostExecute(java.lang.String webData) {
    super.onPostExecute(webData);
    flickrRecyclerViewAdapter = new com.example.android.flickrbrowser.FlickrRecyclerViewAdapter(this, getMPhotos());
    mRecyclerView.setAdapter(flickrRecyclerViewAdapter);
}