public static long largestPrimeFactor(long input) {
    java.util.ArrayList<java.lang.Long> list = projectEuler.ProjectHelper.primeFactor(input);
    long output = list.get(((list.size()) - 1));
    return output;
}