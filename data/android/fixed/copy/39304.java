public static double randomGauss(double mean, double sd) {
    return ((sfb732.kamoso.util.MyMathHelper.RAND.nextGaussian()) * sd) + mean;
}