private double limit(double value) {
    if (value > 1.0) {
        value = 1.0;
    }else
        if (value < 0) {
            value = 0;
        }
    
    return value;
}