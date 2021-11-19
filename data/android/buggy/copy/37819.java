private boolean isAllowed(java.lang.Object caller) {
    if (caller instanceof com.dbegnis.network.ClientConnection) {
        if ((((com.dbegnis.network.ClientConnection) (caller)).getRightsGroup()) >= (group)) {
            return true;
        }
        return false;
    }
    return true;
}