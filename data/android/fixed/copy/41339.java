@java.lang.Deprecated
public static boolean confirmRequest(android.net.Uri uri, java.lang.String request) {
    return uri.getPathSegments().get(0).equals(request);
}