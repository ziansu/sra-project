static long acker(int m, int n) {
    long start;
    long end;
    start = java.lang.System.currentTimeMillis();
    javacpp.cmr.com.sdkvsndk.Algorithm.unacker(m, n);
    end = java.lang.System.currentTimeMillis();
    return end - start;
}