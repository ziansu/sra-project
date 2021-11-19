private double randomNumber() {
    java.util.Random randomGenerator = new java.util.Random();
    double max = 2.4 / 2;
    double min = -max;
    return min + ((max - min) * (randomGenerator.nextDouble()));
}