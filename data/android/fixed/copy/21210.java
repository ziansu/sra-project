private int returnRandom() {
    return java.util.concurrent.ThreadLocalRandom.current().nextInt(MIN, ((MAX) + 1));
}