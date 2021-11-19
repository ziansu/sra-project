@java.lang.Override
public void onNext(team4.weekathon.com.sitapp.SensorsChair.SENSORS_CODE_LIST sensorCode) {
    if (firstTimeOfUse) {
        firstTimeOfUse = false;
    }else {
        updateSensorUI(sensorCode);
    }
}