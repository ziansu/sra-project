@java.lang.Override
public void onPause(boolean multitasking) {
    super.onPause(multitasking);
    com.plugin.gcm.PushPlugin.gForeground = false;
}