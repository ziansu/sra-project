public int power(int x, int y) {
    int powx = 1;
    for (int i = 1; i <= y; i++) {
        powx *= x;
    }
    return powx;
}