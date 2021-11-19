@java.lang.Override
public void bitmapwork(android.graphics.Bitmap bitmap) {
    if (bitmap != null) {
        builder.setLargeIcon(bitmap);
    }else {
        builder.setLargeIcon(com.rks.musicx.misc.utils.ArtworkUtils.getDefaultArtwork(getApplicationContext()));
    }
}