private void showTimerPickerDialog() {
    if ((cal) == null) {
        cal = java.util.Calendar.getInstance();
    }
    cbstudios.coffeebreak.view.activity.TaskEditActivity.TimePickerFragment fragment = new cbstudios.coffeebreak.view.activity.TaskEditActivity.TimePickerFragment();
    fragment.setCalendar(cal);
    fragment.show(getFragmentManager(), "timePicker");
}