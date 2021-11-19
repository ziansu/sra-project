@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    currentAcceleration = event.values[1];
    telemetry.log.add(("acceleration is: " + (java.lang.Float.toString(currentAcceleration))));
    android.util.Log.d("accelerometer", java.lang.Float.toString(currentAcceleration));
}