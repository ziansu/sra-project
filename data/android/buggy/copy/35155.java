public void transmitVector() {
    double desired_theta = mRoute.calculateVector(mStep);
    java.lang.String message = ("#" + ((float) (desired_theta))) + "~";
    transmission(message);
}