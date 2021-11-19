public static int randInt(int min, int max) {
    return java.util.concurrent.ThreadLocalRandom.current().nextInt(min, (max + 1));
}