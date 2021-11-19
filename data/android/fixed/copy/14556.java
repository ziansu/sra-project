void calculateCurrent() {
    current = ((volts[0]) - (volts[1])) / (resistance);
    if ((resistance) == 0)
        current = 0;
    
}