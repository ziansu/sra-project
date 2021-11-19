public static java.util.stream.IntStream mkStream(int offset, int n) {
    return java.util.stream.Stream.iterate(offset, ( i) -> i + 1).mapToInt(github.com.beenotung.javalib.Utils::id).limit(n);
}