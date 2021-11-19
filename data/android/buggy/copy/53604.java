@java.lang.Override
public void afterTextChanged(android.text.Editable s) {
    if (!(updating)) {
        updateView(se.mecona.cuttingspeed.MainActivity.SourceEnum.DIAMETER);
    }
}