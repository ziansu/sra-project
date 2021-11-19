private java.util.ArrayList<java.lang.Double> generateRandomDoubles(int n) {
    java.util.ArrayList<java.lang.Double> doubles = new java.util.ArrayList<>();
    while (n > 0) {
        doubles.add(rng.nextDouble());
        n--;
    } 
    return doubles;
}