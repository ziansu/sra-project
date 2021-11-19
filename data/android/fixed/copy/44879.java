private double doNothingConstraint(int steps) {
    if (steps >= (MIN_DO_NOTHING_STEPS)) {
        return 1.0;
    }else {
        return 1.0 / ((MIN_DO_NOTHING_STEPS) - steps);
    }
}