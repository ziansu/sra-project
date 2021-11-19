public synchronized void addUrlToCheck(java.util.ArrayList<java.lang.String> urls) {
    if ((urls != null) && ((urls.size()) > 0)) {
        buffer.addAll(urls);
        isChecking = true;
    }
}