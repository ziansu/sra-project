public void setLight(boolean lightState) {
    if (((getSensors()) == null) && (!(getSensors().containsKey("dualDistance"))))
        return ;
    
    isOn = lightState;
    distanceSensor.setStatusLed(isOn);
}