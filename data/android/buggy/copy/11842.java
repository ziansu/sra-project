public static <T> org.openhab.binding.mysensors.internal.sensors.MySensorsChild<T> createChild(int childId, int childType, T value) {
    org.openhab.binding.mysensors.internal.sensors.MySensorsChild<T> child = null;
    child = new org.openhab.binding.mysensors.internal.sensors.MySensorsChild<T>(childId, value);
    return child;
}