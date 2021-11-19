public double division(int a, int b) {
    if ((a == 0) || (b == 0))
        throw new java.lang.ArithmeticException("Division on 0");
    
    return a / b;
}