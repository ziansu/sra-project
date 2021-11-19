public double getPrecision() {
    if (!(calculated))
        calculate();
    
    return ((tp) * 1.0) / ((fp) + (fn));
}