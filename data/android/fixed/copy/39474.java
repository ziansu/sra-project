private java.lang.String getURL(android.content.Context ctx) {
    boolean isDebuggable = 0 != (ctx.getApplicationInfo().flags &= android.content.pm.ApplicationInfo.FLAG_DEBUGGABLE);
    if (isDebuggable) {
        return com.boha.golfpractice.library.util.OKUtil.PROD_URL;
    }else {
        return com.boha.golfpractice.library.util.OKUtil.PROD_URL;
    }
}