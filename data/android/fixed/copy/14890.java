public double get_recall() {
    if (((TP) + (FN)) == 0) {
        return 0;
    }else {
        return (TP) / ((TP) + (FN));
    }
}