public void fill() {
    java.util.Random random = new java.util.Random();
    int maxItemsAllowed = getMaximumAllowed();
    setAmountInJar(((random.nextInt((maxItemsAllowed + 1))) + 1));
}