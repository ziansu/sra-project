@java.lang.Override
public void onYearSelected(int year) {
    adjustDayInMonthIfNeeded(mCalendar);
    mCalendar.set(java.util.Calendar.YEAR, year);
    updatePickers();
    setCurrentView(com.wdullaer.materialdatetimepicker.date.DatePickerDialog.MONTH_AND_DAY_VIEW);
    updateDisplay(true);
}