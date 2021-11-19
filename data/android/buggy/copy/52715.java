public static int randomNumber(int min, int max) {
    return ((utils.Utils.randomGenerator.nextInt()) % (max - min)) + min;
}