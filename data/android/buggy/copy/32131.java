private void stopTimer() {
    if ((timer) != null) {
        timer.cancel();
    }
    timeout = false;
    general.SLog.log(SLog.Debug, "LocationManager", "stop fixTimeout timer");
}