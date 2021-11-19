@java.lang.Override
public void onValueChange(android.widget.NumberPicker picker, int oldVal, int newVal) {
    month = newVal - 1;
    updateDateControl();
    onDateTimeChanged();
}