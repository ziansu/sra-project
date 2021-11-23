void test3(int[] a, int b) {
    @org.checkerframework.checker.index.qual.IndexOrLow(value = "a")
    int k;
    k = (a.length) - b;
}