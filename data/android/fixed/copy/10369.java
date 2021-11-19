@java.lang.Override
public void onClick(android.view.View v) {
    if (!(isMeasurementStarted)) {
        onStartClicked();
    }else {
        onStopClicked(false);
    }
}