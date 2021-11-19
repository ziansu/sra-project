@java.lang.Override
public void onClickSwitch(boolean switchToPanel) {
    android.widget.Toast.makeText(this, ("" + switchToPanel), Toast.LENGTH_SHORT).show();
    if (switchToPanel) {
        mEmotionsEditText.clearFocus();
    }else {
        mEmotionsEditText.requestFocus();
    }
}