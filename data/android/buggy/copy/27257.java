public static void test_031() {
    excute(testcase.Object_ResIdText, testcase.Operation_ClickWait, "com.android.music:id/albumtab", "专辑");
    excute(testcase.Object_ResIdInstance, testcase.Operation_ClickWait, "com.android.music:id/line1", "0");
    check(testcase.Object_TextScroll, testcase.Operation_checkExist, "Test");
    check(testcase.Object_TextScroll, testcase.Operation_checkExist, "Test1");
}