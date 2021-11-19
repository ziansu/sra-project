public void clear() {
    try {
        mCache.delete();
        java.lang.System.out.println("ClearCache");
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}