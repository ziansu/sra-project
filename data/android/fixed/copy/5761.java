static float clampToJointRange(float value, float maxDisplacement) {
    if (value > maxDisplacement)
        return maxDisplacement;
    else
        if (value < (-maxDisplacement))
            return -maxDisplacement;
        
    
    return value;
}