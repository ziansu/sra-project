long f(long x, int y) {
    long z = 0;
    while ((y--) > 0)
        z += x;
    
    return z;
}