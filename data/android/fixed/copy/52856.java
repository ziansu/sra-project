@java.lang.Override
public void onClick(android.view.View v) {
    if (isTimerRunning) {
        stopTimer();
    }else {
        startTimer();
    }
}