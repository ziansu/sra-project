@java.lang.Override
public void onClick(android.view.View v) {
    android.app.admin.DevicePolicyManager policyManager = ((android.app.admin.DevicePolicyManager) (getSystemService(com.timothy.Activitys.DEVICE_POLICY_SERVICE)));
    policyManager.lockNow();
    finish();
}