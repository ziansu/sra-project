public void closeClaw(int ms) {
    clawLeft.setPosition(CLAW_LEFT_CLOSED);
    clawRight.setPosition(CLAW_RIGHT_CLOSED);
    sleep(ms);
}