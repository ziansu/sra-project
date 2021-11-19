public void gc() {
    long start = java.lang.System.currentTimeMillis();
    java.lang.System.gc();
    Log.println((("garbage collection: " + ((java.lang.System.currentTimeMillis()) - start)) + " ms"));
}