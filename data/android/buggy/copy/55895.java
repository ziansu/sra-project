@java.lang.Override
public void run() {
    if ((testsRunning) == false) {
        android.widget.Toast.makeText(context, getString(R.string.no_connectivity), Toast.LENGTH_LONG).show();
        tv_Gauge_TextView_PsuedoButton.setClickable(false);
    }
}