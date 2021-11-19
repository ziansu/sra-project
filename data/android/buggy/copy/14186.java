protected int a() {
    double j = 1 + 1;
    if (j > 1) {
        return 2;
    }
    while (j < 10) {
        j--;
        continue;
    } 
    return 1;
}