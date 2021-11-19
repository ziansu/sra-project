public static <T> T oneOf(java.util.List<T> l, java.util.Random rng) {
    int i = rng.nextInt(l.size());
    return l.get(i);
}