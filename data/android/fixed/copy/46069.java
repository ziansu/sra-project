public void bindGuardService() {
    com.squareup.leakcanary.CanaryLog.d("AssistiveResultService bindGuardService");
    android.content.Intent intent = new android.content.Intent(this, com.squareup.leakcanary.assistivetouch.AssistiveGuardService.class);
    bindService(intent, connection, Context.BIND_AUTO_CREATE);
    isBind = true;
}