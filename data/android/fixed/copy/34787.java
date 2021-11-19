@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        safetyCB.setChecked(false);
        returnedYdLnEditText.setText("0");
    }
}