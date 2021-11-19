public boolean isRunnable() {
    boolean result = (java.lang.Thread.currentThread()) == (getThreadObject());
    android.util.Log.i("ThreadCore=", (result + ""));
    return result;
}