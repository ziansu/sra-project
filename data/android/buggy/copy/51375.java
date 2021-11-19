private java.lang.String getGxBasicAuthToken() {
    gxClientId = "XXX";
    final java.lang.String gxClientSec = "YYY";
    final java.lang.String unencodedString = ((gxClientId) + ":") + gxClientSec;
    return java.util.Base64.getEncoder().encodeToString(unencodedString.getBytes());
}