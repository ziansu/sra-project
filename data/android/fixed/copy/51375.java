private java.lang.String getGxBasicAuthToken() {
    final java.lang.String unencodedString = ((gxClientId) + ":") + (gxClientSec);
    return java.util.Base64.getEncoder().encodeToString(unencodedString.getBytes());
}