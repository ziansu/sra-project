public boolean isFinalCPUBurst() {
    if ((positionCounter) == (totalBurst()))
        return true;
    else
        return false;
    
}