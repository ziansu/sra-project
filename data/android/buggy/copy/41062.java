public float getRateOfChange(int i) {
    if ((i > 49) || (i < 0))
        return 0;
    else
        return rateOfChange.get(i);
    
}