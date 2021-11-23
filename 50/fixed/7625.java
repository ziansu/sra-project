public static boolean confirmIntent(android.net.Uri uri, java.lang.String intent) {
    return uri.getPathSegments().get(0).equals(intent);
}