public double getLength() {
    double length = point1.distance(point2);
    if ((length == (java.lang.Double.NaN)) || (length <= 0)) {
        java.lang.System.err.println(("length is an invalid value; " + length));
    }
    return length;
}