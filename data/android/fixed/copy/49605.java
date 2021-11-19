private double functionPMax(double indf, double pref, double x) {
    if (x < indf)
        return 0.0;
    else
        if (x > pref)
            return 1.0;
        else
            return (x - indf) / (indf - pref);
        
    
}