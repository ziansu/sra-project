public boolean canGive(int p) {
    if (p < 0)
        return false;
    
    return !(played[p]);
}