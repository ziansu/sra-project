public void sendSignal(double u) {
    left.setPower(((int) (java.lang.Math.round(u))));
    right.setPower(((int) (java.lang.Math.round(u))));
}