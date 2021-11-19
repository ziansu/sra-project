private engine.LocalFolder getStorage() {
    if ((mStorage) == null) {
        java.io.File root = android.os.Environment.getExternalStorageDirectory();
        mStorage = new com.dmitrymalkovich.fileexplorer.LocalFolderImpl(root);
        mStorage.setPredefinedThumbnail(R.drawable.ic_home_grey600_24dp);
    }
    return mStorage;
}