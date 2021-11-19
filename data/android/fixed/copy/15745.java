@org.jetbrains.annotations.Nullable
protected static java.lang.String convertStreamToString(@org.jetbrains.annotations.Nullable
java.io.InputStream inputStream) {
    if (inputStream == null) {
        return null;
    }
    java.util.Scanner s = new java.util.Scanner(inputStream).useDelimiter("\\A");
    return s.hasNext() ? s.next() : "";
}