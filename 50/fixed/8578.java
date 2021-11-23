public static void setContext(android.content.Context c) {
    if (c != null)
        com.adsamcik.signalcollector.utility.DataStore.contextWeak = new java.lang.ref.WeakReference(c);
    
}