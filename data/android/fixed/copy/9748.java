void addIndexOrLow(@org.checkerframework.checker.index.qual.IndexOrLow(value = "arr")
int v) {
    @org.checkerframework.checker.index.qual.IndexOrHigh(value = "arr")
    int result = 1 + v;
    @org.checkerframework.checker.index.qual.IndexFor(value = "arr")
    int indexFor = 1 + v;
}