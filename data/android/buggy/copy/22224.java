public static java.util.LinkedList<java.lang.Integer> convertArray(int[] array) {
    return ((java.util.LinkedList<java.lang.Integer>) (java.util.stream.IntStream.of(array).boxed().collect(java.util.stream.Collectors.toList())));
}