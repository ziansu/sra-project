@java.lang.Override
protected boolean isFinished() {
    return ((java.lang.System.currentTimeMillis()) - (timeInit)) >= ((distance) / (Constants.Autonomous.DRIVE_VEL));
}