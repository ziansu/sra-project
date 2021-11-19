private void turnOnHeatWhenTooCold() {
    if ((hvac.temp()) < (min)) {
        hvac.heat(true);
        if (heaterFanTimer.canRun()) {
            hvac.fan(true);
        }
    }
}