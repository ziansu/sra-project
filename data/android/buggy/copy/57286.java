private java.lang.Iterable<Key> keys(Key min, Key max) {
    java.util.Queue<Key> queue = new java.util.ArrayDeque<>();
    keys(root, queue, min, max);
}