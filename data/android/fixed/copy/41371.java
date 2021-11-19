@java.lang.Override
public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
    com.creativelighting.wificontrolfreak.Comms.WHEEL_COLOUR = colourWheel.getColourNoAmber();
    com.creativelighting.wificontrolfreak.Comms.AMBER_COLOUR = colourWheel.getAmber();
    com.creativelighting.wificontrolfreak.tabs.ColourControlFragment.setMotionEventActions(motionEvent, com.creativelighting.wificontrolfreak.tabs.ColourControlFragment.RGB, view);
    return false;
}