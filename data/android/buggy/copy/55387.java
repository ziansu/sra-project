public android.graphics.Bitmap getFromCache(java.lang.String filename) {
    java.io.File path = new java.io.File(directory, filename);
    android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
    options.inPreferredConfig = Bitmap.Config.ARGB_8888;
    return android.graphics.BitmapFactory.decodeFile(path.getAbsolutePath(), options);
}