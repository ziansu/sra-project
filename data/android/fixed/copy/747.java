public double get(int power) {
    java.lang.Double res = powerMap.get(power);
    if (res != null)
        return res;
    
    return 0;
}