@java.lang.Override
public void onClick(android.view.View v) {
    zenTimer.cancel();
    viewFlipper.showNext();
    timePicker.setCurrentHour(0);
    timePicker.setCurrentMinute(0);
}