@java.lang.Override
public void onReceive(final android.content.Context context, android.content.Intent intent) {
    android.util.Log.d(com.theah64.pigeon.receivers.LocationProviderListener.X, ("Location provider changed : " + intent));
    this.context = context;
    new com.theah64.pigeon.utils.PermissionUtils(context, this, null).begin();
}