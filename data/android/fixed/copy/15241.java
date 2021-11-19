public java.lang.String createSession() {
    java.lang.String url = "createsessionJson/";
    url += (devId) + "/";
    url += (generateSignature("createsession")) + "/";
    url += generateTimestamp();
    return url;
}