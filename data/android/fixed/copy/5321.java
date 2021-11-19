@java.lang.Override
public void onResult(dji.sdk.api.GroundStation.DJIGroundStationTypeDef.GroundStationResult groundStationResult) {
    if (com.jarone.litterary.drone.GroundStation.resultSuccess(groundStationResult)) {
        com.jarone.litterary.drone.DroneState.setMode(DroneState.DIRECT_MODE);
    }
}