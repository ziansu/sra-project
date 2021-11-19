public R handleInput(java.lang.String inputLine) {
    R reading = createReading(inputLine);
    if (reading != null) {
        notifyListeners(reading);
    }
    return reading;
}