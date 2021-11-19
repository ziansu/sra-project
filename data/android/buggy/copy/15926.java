private double computeVelocity() {
    double numerator = (it.blogspot.geoframe.sewerPipeDimensioning.SewerPipeDimensioning.discharge) * 8;
    double denominator = (diameter) * ((fillAngle) - (java.lang.Math.sin(fillAngle)));
    return numerator / denominator;
}