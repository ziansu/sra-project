void doBindService() {
    android.content.Intent intent = new android.content.Intent(this, com.squareup.leakcanary.assistivetouch.AssistiveGuardService.class);
    intent.putExtra(AssistiveGuardService.BIND_KEY, AssistiveGuardService.BIND_DISPLAY_LEAK_ACTIVITY);
    bindService(intent, connection, Context.BIND_AUTO_CREATE);
    mIsBound = true;
}