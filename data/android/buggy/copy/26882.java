public static int canWinNim(int a, int b) {
    int sum = 0;
    while (b != 0) {
        int carry = a & b;
        sum = a ^ b;
        b = carry << 1;
    } 
    return sum;
}