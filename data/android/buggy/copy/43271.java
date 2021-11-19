private static int factorial(int i) {
    int sum = i;
    while (i > 0) {
        sum *= i;
        i--;
    } 
    return sum;
}