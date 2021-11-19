@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent msg) {
    if (keyCode == (android.view.KeyEvent.KEYCODE_BACK)) {
        this.finish();
        startActivity(new android.content.Intent(this, com.voidcode.diasporawebclient.MainActivity.class));
        return false;
    }else {
        return true;
    }
}