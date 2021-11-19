@java.lang.Override
protected java.util.ArrayList<com.example.leslie.photogallery.GalleryItem> doInBackground(java.lang.Void... voids) {
    mItems = new com.example.leslie.photogallery.FlickrFetchr().fetchItems();
    return mItems;
}