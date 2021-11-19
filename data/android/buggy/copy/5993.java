void test3(int[] a, int b) {
    @org.checkerframework.checker.index.qual.IndexOrLow(value = "a")
    int k = (a.length) - b;
}