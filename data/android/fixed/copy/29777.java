private android.net.Uri getOutputMediaFileUri(int type) {
    if ((getOutputMediaFile(type)) != null) {
        return android.net.Uri.fromFile(getOutputMediaFile(type));
    }else {
        return null;
    }
}