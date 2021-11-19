public void onHitWall(JarvRobot.HitWallEvent e) {
    double distance = 50;
    if (runningAhead) {
        back(distance);
    }else {
        ahead(distance);
    }
    runningAhead = !(runningAhead);
}