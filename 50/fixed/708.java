public static void assertTrue(boolean condition, java.lang.String message) {
    if (!condition) {
        com.triangleleft.assertdialog.AssertDialog.fail(message);
    }
}