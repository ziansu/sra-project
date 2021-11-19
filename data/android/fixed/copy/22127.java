public void right(int ms, double speed) {
    motorBR.setPower(0);
    motorFR.setPower(0);
    motorBL.setPower(speed);
    motorFL.setPower(speed);
    halt();
}