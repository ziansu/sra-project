private boolean assetExists(java.lang.String assetString, android.content.Context context) {
    android.content.res.AssetManager am = context.getAssets();
    try {
        java.io.InputStream inputStream = am.open(assetString);
    } catch (java.io.IOException e) {
        return false;
    }
    return true;
}