public void run() {
    try {
        android.app.Instrumentation inst = new android.app.Instrumentation();
        inst.sendKeyDownUpSync(KeyEvent.KEYCODE_MENU);
    } catch (java.lang.Exception e) {
    }
}