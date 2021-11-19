private int binaryToDecimal(int number) {
    java.lang.String s = java.lang.Integer.toString(number);
    int n = java.lang.Integer.parseInt(s, 2);
    return n;
}