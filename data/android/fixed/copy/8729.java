private double sceneToWorldY(double y) {
    double wy = ((y - ((cvs.getHeight()) / 2)) / (scale)) - (translateY);
    return wy;
}