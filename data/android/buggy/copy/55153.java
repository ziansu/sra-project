@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    mSettings.setShowImeWithHardKeyboard(isChecked);
    hideInputMethodMenu();
}