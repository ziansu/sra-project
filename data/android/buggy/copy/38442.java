public void updateTheta(double rate) {
    double deltaTheta = (-rate) * (delta);
    theta += deltaTheta;
}