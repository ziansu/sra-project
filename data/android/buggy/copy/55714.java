private double limit(double value) {
    double l = 0.0;
    if (value > 1.0) {
        l = 1.0;
    }else
        if (value < 0) {
            l = 0;
        }
    
    return l;
}