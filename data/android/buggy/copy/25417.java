@java.lang.Override
protected java.util.List<com.example.miljanrakita.photogallery.Model.GalleryItem> doInBackground(java.lang.Void... params) {
    return new com.example.miljanrakita.photogallery.Model.FlickrFetchr().fetchItems();
}