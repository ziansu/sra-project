@java.lang.Override
public void onActivityActivate() {
    getLog().info("Activity is.erle.mavlink activate");
    getDataStream(MAV_DATA_STREAM.MAV_DATA_STREAM_ALL, 1);
}