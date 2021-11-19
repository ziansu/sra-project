@java.lang.Override
public boolean takeControl() {
    return ((state.getState()) == (ve.ucv.ciens.cicore.icaro.ryabi.utils.States.WANDER)) && (queue.hasNextTouchSensorEvent());
}