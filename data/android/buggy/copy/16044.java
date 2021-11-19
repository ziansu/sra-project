private static java.lang.Integer average(java.util.List<java.lang.Integer> list) {
    int sum = 0;
    for (java.lang.Integer i : list) {
        sum += i;
    }
    return sum / (list.size());
}