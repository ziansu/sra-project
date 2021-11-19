public java.math.BigDecimal getAvg(int scale) {
    if ((count) == 0)
        return null;
    
    return sum.divide(new java.math.BigDecimal(count), scale, java.math.BigDecimal.ROUND_HALF_UP);
}