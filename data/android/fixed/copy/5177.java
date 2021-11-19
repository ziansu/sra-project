@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
    java.lang.System.out.println(sensorEvent.toString());
    java.lang.System.out.println("new step registered!");
    manager.newStepDone();
    loadTodo();
}