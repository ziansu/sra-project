@java.lang.Override
public void onTimeSet(android.widget.TimePicker timePicker, int hour, int minute) {
    hourOfDay = hour;
    minuteOfDay = minute;
    setAlarm();
    showDialogMessage("Alarm", "Alarm settings was successful ", SweetAlertDialog.SUCCESS_TYPE);
}