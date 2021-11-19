@java.lang.Override
public void onValueChange(android.widget.NumberPicker picker, int oldVal, int newVal) {
    dayOfMonth = newVal;
    onDateTimeChanged();
}