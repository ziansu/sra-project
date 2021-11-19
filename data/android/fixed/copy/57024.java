public org.openobservatory.measurement_kit.android.IntentRouter emit_intent(android.content.Intent intent) {
    lbm.sendBroadcast(intent);
    return this;
}