@java.lang.Override
public void onResult(dji.sdk.api.GroundStation.DJIGroundStationTypeDef.GroundStationResult groundStationResult) {
    com.jarone.litterary.handlers.MessageHandler.d(("Engage Joystick: " + (groundStationResult.toString())));
    if (com.jarone.litterary.drone.GroundStation.resultSuccess(groundStationResult)) {
        com.jarone.litterary.drone.DroneState.setMode(DroneState.DIRECT_MODE);
    }
}