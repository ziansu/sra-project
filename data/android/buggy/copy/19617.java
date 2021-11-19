protected void onPostExecute(java.lang.String webData) {
    super.onPostExecute(java.lang.String);
    flickrRecyclerViewAdapter = new com.example.android.flickrbrowser.FlickrRecyclerViewAdapter(this, getMPhotos());
    mRecyclerView.setAdapter(flickrRecyclerViewAdapter);
}