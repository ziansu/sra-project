public void test_012() throws android.os.RemoteException, com.android.uiautomator.core.UiObjectNotFoundException {
    excute(testcase.Object_ResourceId, testcase.Operation_ClickWait, "com.android.settings:id/title", "WLAN");
    check(testcase.Object_Text, testcase.Operation_checkExist, "WLAN");
}