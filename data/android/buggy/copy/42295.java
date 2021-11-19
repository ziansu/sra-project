static double getADL() {
    double total = 0;
    for (double d : rallocloud.main.Statistician.delays) {
        total += d;
    }
    return total / (rallocloud.main.Statistician.delays.size());
}