private void readPhotosName() throws java.io.IOException {
    android.content.res.AssetManager am = fragment.getContext().getAssets();
    photos = am.list("photo");
}