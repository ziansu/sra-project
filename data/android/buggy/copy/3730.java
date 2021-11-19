@java.lang.Override
public void run() {
    me.mDatabase.delete(com.audacious_software.passive_data_kit.generators.sensors.Accelerometer.TABLE_HISTORY, where, args);
}