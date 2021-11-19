private double functionPMax(double indf, double pref, double x) {
    if (x < pref)
        return 1.0;
    else
        if (x < indf)
            return (indf - x) / (indf - pref);
        else
            return 0.0;
        
    
}