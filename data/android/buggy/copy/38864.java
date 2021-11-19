@java.lang.Override
public android.os.IBinder onBind(android.content.Intent intent) {
    if (org.wahtod.wififixer.WifiFixerService.logging)
        org.wahtod.wififixer.utility.LogService.log(this, org.wahtod.wififixer.WifiFixerService.APP_NAME, ((getString(R.string.onbind_intent)) + (intent.toString())));
    
    return null;
}