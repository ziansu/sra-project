public static void assertTrue(java.lang.String message, boolean condition) {
    if (!condition) {
        com.triangleleft.assertdialog.AssertDialog.fail(message);
    }
}