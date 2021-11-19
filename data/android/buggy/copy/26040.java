private void freeMemory() {
    java.lang.System.runFinalization();
    java.lang.Runtime.getRuntime().gc();
    java.lang.System.gc();
    android.util.Log.e("Memory", "freeMemory executed...");
}