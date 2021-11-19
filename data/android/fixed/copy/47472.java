public static java.lang.Object oneOf(java.util.List l, java.util.Random rng) {
    int i = rng.nextInt(l.size());
    return l.get(i);
}