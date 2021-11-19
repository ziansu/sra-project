public void decrementTemperature() {
    thermometer.decrementTemperature();
    if ((thermometer.getTemperature()) <= (thermometer.getMinThreshold())) {
        deactivateSprinklers();
    }
}