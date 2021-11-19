public static void navigation(android.content.Context context) {
    android.widget.TextView tv = new android.widget.TextView(context);
    if ((meng.animtest.asdemo.BasicShortcutsDemo.testListener) != null) {
        meng.animtest.asdemo.BasicShortcutsDemo.testListener.onEvent();
    }
}