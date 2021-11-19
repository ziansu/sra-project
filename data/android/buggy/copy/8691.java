public static boolean isMediaDocument(android.net.Uri uri) {
    return "com.android.providers.media.documents".equals(uri.getAuthority());
}