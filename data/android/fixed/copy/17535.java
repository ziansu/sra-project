protected static void initialize(android.content.Context context, com.binarapps.android.cookielogger.interfaces.CLogInterface send, java.lang.String tag) {
    com.binarapps.android.cookielogger.AppContext.instance = new com.binarapps.android.cookielogger.AppContext(context, send, tag);
}