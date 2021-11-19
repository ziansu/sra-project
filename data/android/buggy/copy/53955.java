@java.lang.Override
public void onRangeValue(int rangeValue, com.freedomotic.model.ds.Config params, boolean fireCommand) {
    boolean executed = executeCommand("set saturation", params);
    if (executed) {
        setSaturation(rangeValue);
    }
}