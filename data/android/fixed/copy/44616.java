protected static int calculateNumberOfCores(int availableProcessors) {
    return java.lang.Math.max((availableProcessors - 1), 1);
}