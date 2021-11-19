public void test_031() throws android.os.RemoteException, com.android.uiautomator.core.UiObjectNotFoundException {
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "SIM 卡");
    excute(testcase.Object_ResIdInstance, testcase.Operation_ClickWait, "android:id/summary", "0");
    check(testcase.Object_ResourceId, testcase.Operation_checkExist, "android:id/alertTitle", "SIM 卡插槽 1");
}