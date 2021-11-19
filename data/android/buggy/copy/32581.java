public boolean isAfter(double point) {
    if (positiveDirection)
        return point > (endpoint2);
    else
        return point < (endpoint1);
    
}