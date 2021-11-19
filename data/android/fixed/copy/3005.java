private int bound(int n) {
    if (n < 0) {
        n += org.ag.ants_utils.Variables.DIM;
    }else
        if (n > ((org.ag.ants_utils.Variables.DIM) - 1)) {
            n -= org.ag.ants_utils.Variables.DIM;
        }
    
    return n;
}