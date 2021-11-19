@java.lang.Override
public void onDateSet(com.wdullaer.materialdatetimepicker.date.DatePickerDialog view, int year, int monthOfYear, int dayOfMonth) {
    monthOfYear++;
    mDate = (((dayOfMonth + "/") + monthOfYear) + "/") + year;
    mDateText.setText(mDate);
}