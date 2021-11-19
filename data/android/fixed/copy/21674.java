private static com.google.android.gms.wearable.Asset createAssetFromBitmap(android.graphics.Bitmap bitmap) {
    final java.io.ByteArrayOutputStream byteStream = new java.io.ByteArrayOutputStream();
    return com.google.android.gms.wearable.Asset.createFromBytes(byteStream.toByteArray());
}