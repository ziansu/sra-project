private int getRowDif(int number, int pos) {
    int result = (number / (N)) - (pos / (N));
    return result > 0 ? result : -result;
}