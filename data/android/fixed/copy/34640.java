@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
    loadTodo();
    manager.newStepDone();
    loadTodo();
}