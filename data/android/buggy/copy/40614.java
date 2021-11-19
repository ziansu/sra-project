@java.lang.Override
protected void onPause() {
    super.onPause();
    com.alejandrolai.sfpark.Timer.ReminderActivity.systemTimeWhenPause = java.lang.System.currentTimeMillis();
    com.alejandrolai.sfpark.Timer.ReminderActivity.timeInTimerWhenPause = millisecs;
    com.alejandrolai.sfpark.Timer.ReminderActivity.textInNotes = notes.getText().toString();
    timer.cancel();
    com.alejandrolai.sfpark.Timer.ReminderActivity.isPaused = true;
}