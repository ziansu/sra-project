private double sedimentation(double v) {
    return v > (parms.Vd) ? 0 : (parms.Cd) / v;
}