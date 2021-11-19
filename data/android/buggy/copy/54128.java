@java.lang.Override
public void onFail() {
    pCircle.dismiss();
    android.widget.Toast.makeText(getApplicationContext(), "Can not get sensor data", Toast.LENGTH_SHORT).show();
    sensor.removeListener();
}