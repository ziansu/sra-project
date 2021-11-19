public static boolean isForBackend(java.util.Set<java.lang.String> backendNames, java.util.Set<java.lang.String> backends) {
    if (backendNames != null) {
        if (!(backends.containsAll(backendNames))) {
            return false;
        }
    }
    return true;
}