public double get_recall() {
    try {
        return (TP) / ((TP) + (FN));
    } catch (java.lang.ArithmeticException e) {
        return 0.0;
    }
}