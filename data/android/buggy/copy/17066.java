public static void loadMozGlue(final android.content.Context context) {
    synchronized(org.mozilla.gecko.mozglue.GeckoLoader.sLibLoadingLock) {
        if (org.mozilla.gecko.mozglue.GeckoLoader.sMozGlueLoaded) {
            return ;
        }
        org.mozilla.gecko.mozglue.GeckoLoader.sMozGlueLoaded = true;
    }
    org.mozilla.gecko.mozglue.GeckoLoader.doLoadLibrary(context, "mozglue");
}