@java.lang.Override
public void onClick(android.view.View v) {
    boolean state = mRscpService.getSensorLocation();
    mStateProgressBar.setVisibility(View.VISIBLE);
    mStateTextView.setText(com.example.android.bluetoothlegatt.RSCPActivity.EXEC);
}