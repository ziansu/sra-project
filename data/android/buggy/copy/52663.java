private boolean isReachable(java.lang.String ipAddress) {
    try {
        client.Connect();
    } catch (java.lang.Exception e) {
        return false;
    }
    return true;
}