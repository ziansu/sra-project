@java.lang.Override
public void onDateSet(com.wdullaer.materialdatetimepicker.date.DatePickerDialog datePickerDialog, int i, int i1, int i2) {
    startTime = startTime.withYear(i);
    startTime = startTime.withMonthOfYear(i1);
    startTime = startTime.withDayOfYear(i2);
    startTimeDialog();
}