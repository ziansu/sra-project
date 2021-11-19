public boolean isBefore(double point) {
    if (positiveDirection)
        return point < (endpoint1);
    else
        return point > (endpoint1);
    
}