@java.lang.Override
public double curve(double a) {
    return 1 - (super.curve((1 - a)));
}