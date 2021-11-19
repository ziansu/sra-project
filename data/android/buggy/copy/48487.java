private void UiOnAccidentDetected() {
    android.util.Log.d(maustemies.halyttaja.MainActivity.LOG_TAG_MAIN_ACTIVITY, "UiOnAccidentDetected()");
    new maustemies.halyttaja.ApplicationEnforcer().start();
    textViewStatus.setText(R.string.textAccidentDetected);
    textViewAdvice.setText(R.string.textAdvicePressStopToStopAlarm);
}