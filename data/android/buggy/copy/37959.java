public int getNextFreeFPID() {
    int i = 0;
    while (containsFP(i)) {
        i++;
    } 
    return i;
}