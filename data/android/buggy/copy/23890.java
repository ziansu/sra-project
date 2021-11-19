@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    if (keyCode == (android.view.KeyEvent.KEYCODE_BACK)) {
        fadeDateTime(1, 300);
        resetState();
        return true;
    }else {
        return super.onKeyDown(keyCode, event);
    }
}