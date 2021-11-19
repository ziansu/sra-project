public static int randomNumber(int min, int max) {
    return java.lang.Math.abs((((utils.Utils.randomGenerator.nextInt()) % (max - min)) + min));
}