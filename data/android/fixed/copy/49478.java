@java.lang.Override
public void onRefresh() {
    net.kourlas.voipms_sms.activities.Api.getInstance(getApplicationContext()).updateSmsDatabase(conversationsActivity, true, false);
    net.kourlas.voipms_sms.gcm.Gcm.getInstance(getApplicationContext()).registerForGcm(conversationsActivity, false, false);
}