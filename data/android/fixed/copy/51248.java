@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    int value = numberPicker.getValue();
    mCallback.setServoInputPin(servoType, value);
    editText.setText(java.lang.String.valueOf(value));
}