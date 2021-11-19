public void test_012() throws android.os.RemoteException, com.android.uiautomator.core.UiObjectNotFoundException {
    excute(testcase.Object_Text, testcase.Operation_ClickWait, "WLAN");
    check(testcase.Object_Text, testcase.Operation_checkExist, "WLAN");
}