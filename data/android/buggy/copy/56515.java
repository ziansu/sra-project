public void removeConnection() {
    try {
        if ((client) != null) {
            client.logout();
            client.disconnect();
        }
    } catch (java.lang.Exception e) {
    }
}