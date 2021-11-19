public void left(int ms, double speed) {
    motorBR.setPower(speed);
    motorFR.setPower(speed);
    motorBL.setPower(0);
    motorFL.setPower(0);
    halt();
}