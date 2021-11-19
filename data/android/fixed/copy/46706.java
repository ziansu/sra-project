@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = mContext.getPackageManager().getLaunchIntentForPackage(mContext.getPackageName());
    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
    mContext.startActivity(i);
}