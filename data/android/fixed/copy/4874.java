public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {
    mYear = year;
    mMonth = monthOfYear + 1;
    mDay = dayOfMonth;
    showDialog(getirbitaksi.hackathon.com.getirbitaksihackathon.event.CreateNewEventActivity.TIME_DIALOG_ID);
}