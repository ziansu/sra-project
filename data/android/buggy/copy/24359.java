private double convertHeading(double in) {
    if (in < 0) {
        in += 720;
    }
    in %= 360;
    if (in > 180) {
        return in - 180;
    }else {
        return in;
    }
}