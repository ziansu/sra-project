@java.lang.Override
public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    startDateEditText.setText(formatDate(year, monthOfYear, dayOfMonth));
    startDateEditText.clearFocus();
    layout.requestFocus();
}