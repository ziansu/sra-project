public static boolean confirmIntent(android.net.Uri uri, java.lang.String intent) {
    return uri.getPathSegments().get(1).equals(intent);
}