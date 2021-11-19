public boolean onDistanceTarget() {
    for (org.team1515.botswana.subsystems.MecanumWheel wheel : wheels) {
        return wheel.onDistanceTarget();
    }
    return true;
}