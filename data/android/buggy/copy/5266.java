@java.lang.Override
public void onCreate() {
    final long identityToken = android.os.Binder.clearCallingIdentity();
    data = getContentResolver().query(QuoteProvider.Quotes.CONTENT_URI, null, null, null, null);
    android.os.Binder.restoreCallingIdentity(identityToken);
}