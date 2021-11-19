public int findMaximumValue(int k) {
    int maximumValue = -1;
    for (int i = 0; i < k; i++) {
        maximumValue = pop();
        java.lang.System.out.println(maximumValue);
    }
    return maximumValue;
}