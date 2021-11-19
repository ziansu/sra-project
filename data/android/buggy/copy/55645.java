@java.lang.Override
public void onSensorChanged(android.hardware.SensorEvent event) {
    if ((event.values[0]) <= 50)
        if (mode)
            flipNext();
        else
            flipPrevious();
        
    
}