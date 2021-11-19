private double doNothingConstraint(int steps) {
    if ((MIN_DO_NOTHING_STEPS) < steps) {
        return 1.0;
    }else {
        return 1.0 / ((MIN_DO_NOTHING_STEPS) - steps);
    }
}