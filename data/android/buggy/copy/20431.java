public boolean isReceiver(java.lang.String str) {
    if (str.contains("command not found")) {
        return false;
    }
    return true;
}