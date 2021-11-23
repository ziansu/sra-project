public void signalNextManeuver() {
    if ((directions.size()) > 1)
        bl_handler.send(((directions.get(1).BlueToothCode) + ""));
    
}