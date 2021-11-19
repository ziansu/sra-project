public void clear() {
    try {
        mCache.delete();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}