private boolean verifyGifImage(android.net.Uri gifUri) {
    return (gifUri != null) && (gifUri.toString().endsWith(".gif"));
}