public double getRecallStrict() {
    if ((nTargets) == 0) {
        return 0.0;
    }else {
        return (nCorrectStrict) / ((double) (nTargets));
    }
}