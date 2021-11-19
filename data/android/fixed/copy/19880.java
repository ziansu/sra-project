public int get1RM(int numOfReps, double weightLifted) {
    double oneRM = weightLifted / (1.0278 - (0.0278 * numOfReps));
    return ((int) (java.lang.Math.round(oneRM)));
}