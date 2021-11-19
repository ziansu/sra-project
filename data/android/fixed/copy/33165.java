@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent msg) {
    if (keyCode == (android.view.KeyEvent.KEYCODE_BACK)) {
        this.finish();
        return false;
    }else {
        return true;
    }
}