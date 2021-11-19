@java.lang.Override
public int[] getRawData() throws no.ntnu.item.its.osgi.sensors.common.exceptions.SensorCommunicationException, no.ntnu.item.its.osgi.sensors.common.exceptions.SensorInitializationException {
    return new int[]{ getInt() , getInt() , getInt() };
}