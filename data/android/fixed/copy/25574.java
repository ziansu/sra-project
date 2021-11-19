@java.lang.Override
public void onClick(android.view.View v) {
    if ((zenTimer) != null) {
        zenTimer.cancel();
        viewFlipper.showNext();
        timePicker.setCurrentHour(0);
        timePicker.setCurrentMinute(0);
    }
}