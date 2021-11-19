private static int factorial(int i) {
    int sum = 1;
    while (i > 0) {
        sum *= i;
        i--;
    } 
    return sum;
}