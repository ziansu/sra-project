@java.lang.Override
public void stop() throws org.sensorhub.api.common.SensorHubException {
    if ((commProvider) != null) {
        commProvider.stop();
        commProvider = null;
    }
    if ((dataInterface) != null)
        dataInterface.stop();
    
}