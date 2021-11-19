@java.lang.Override
public void onReceive(final android.content.Context context, android.content.Intent intent) {
    this.context = context;
    new com.theah64.pigeon.utils.PermissionUtils(context, this, null).begin();
}