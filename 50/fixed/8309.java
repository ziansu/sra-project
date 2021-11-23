public static int calculateMin(int[] cratesPerHouse) {
    int min = cratesPerHouse[0];
    for (int x : cratesPerHouse) {
        if (x < min) {
            min = x;
        }
    }
    return min;
}