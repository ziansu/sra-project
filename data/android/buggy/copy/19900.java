public int getValidHVelocity(int h) {
    if (h >= (maxHVelocity)) {
        return maxHVelocity;
    }else
        if (h <= (minHVelocity)) {
            return minHVelocity;
        }else {
            return h;
        }
    
}