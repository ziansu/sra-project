@java.lang.Override
public void run() {
    final int takeOffAltitude = getAppPrefs().getDefaultAltitude();
    getDrone().doGuidedTakeoff(takeOffAltitude);
}