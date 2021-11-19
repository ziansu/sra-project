private java.util.Set<java.util.List<java.lang.Integer>> pobierzPermutacje(java.lang.Integer[] combination) {
    java.util.Set<java.util.List<java.lang.Integer>> setOfArray = new java.util.HashSet<>();
    pobierzPermutacje(combination, 0, setOfArray);
    return setOfArray;
}