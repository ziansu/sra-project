public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    setDatePickerEditText(year, monthOfYear, dayOfMonth);
    selectedYear = year;
    selectedMonth = monthOfYear + 1;
    selectedDay = dayOfMonth;
}