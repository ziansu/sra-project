private double sceneToWorldX(double x) {
    double wx = (((x - ((cvs.getWidth()) / 2)) / (scale)) + 0.5) - (translateX);
    return wx;
}