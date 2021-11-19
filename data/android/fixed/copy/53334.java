public void run() {
    if ((t.canceled) > 0) {
        ballsShot.add(new ca.team2706.scouting.mcmergemanager.datamodels.BallShot(x, y, t.upTimer.currentTime(), t.canceled));
        t.canceled = 0;
    }
}