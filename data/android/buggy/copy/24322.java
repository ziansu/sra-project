private void setPosterAdapter() {
    android.util.Log.v("Home Fragemnt", "Setting Adapter");
    imageAdapter.clear();
    imageAdapter.addAll(tmDbMovieArrayList);
    android.util.Log.v("Home Fragemnt", ("Added Adapter" + (tmDbMovieArrayList.toString())));
}