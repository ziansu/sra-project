@java.lang.Override
public void onClick(android.view.View v) {
    showNotifyTimeDialog(spinnerCardView.getSpinnerStops().getSelectedItem().toString(), inboundStopForecastCardView.getTextViewStopTimes(), index);
}