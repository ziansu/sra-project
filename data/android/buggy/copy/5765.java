private void addTwoDivisorsToArray(int number, int[] factors, int nextFreePosition, int divisor) {
    factors[nextFreePosition] = divisor;
    factors[(nextFreePosition + 1)] = number / divisor;
}