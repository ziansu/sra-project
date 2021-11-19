private double constrainSpeed(double speed) {
    if (speed < 0)
        return 0.0;
    else
        if (speed > 1)
            return 1.0;
        else
            return speed;
        
    
}