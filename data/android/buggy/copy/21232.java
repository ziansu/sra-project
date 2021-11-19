@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    switch (event.sensor.getType()) {
        case android.hardware.Sensor.TYPE_LINEAR_ACCELERATION :
            showFormulaResult();
            break;
        case android.hardware.Sensor.TYPE_ROTATION_VECTOR :
            showFormulaResult();
            break;
    }
}