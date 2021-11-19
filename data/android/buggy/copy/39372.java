public boolean exifSupported(android.content.Context context, us.koller.cameraroll.data.AlbumItem albumItem) {
    java.lang.String mimeType = us.koller.cameraroll.util.MediaType.getMimeType(context, albumItem.getUri(context));
    return us.koller.cameraroll.util.MediaType.doesSupportExif_MimeType(mimeType);
}