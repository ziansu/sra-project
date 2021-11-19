public boolean exceeds4Weeks() {
    long start = java.lang.System.currentTimeMillis();
    long end = start + (2419200 * 1000);
    while ((java.lang.System.currentTimeMillis()) < end) {
        return false;
    } 
    return true;
}