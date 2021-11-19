public void driveAlong(java.util.List<ShortestPath.Node> path, java.lang.Runnable run) {
    this.mPath = path;
    this.onSuccess = run;
    if (setGoal(1)) {
        calculateAngle(goalX, goalX);
        startMovement();
    }
}