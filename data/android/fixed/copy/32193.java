@java.lang.Override
public void timerTaskHandler() {
    (laneBaseHeight)++;
    if ((lanes) != null) {
        for (crossyroad.Lane lane : lanes) {
            lane.update();
        }
    }
}