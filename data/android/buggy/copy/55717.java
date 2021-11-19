public static double compoundInterest(double money, double interestRate, int years) {
    double sum = 1.0;
    for (int i = 0; i < years; i++) {
        sum *= 1 + interestRate;
    }
    return money * sum;
}