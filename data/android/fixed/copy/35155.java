public void transmitVector() {
    double desired_theta = mRoute.calculateVector(mStep);
    desired_theta = 0;
    java.lang.String message = ("#" + ((float) (desired_theta))) + "~";
    transmission(message);
}