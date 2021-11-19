private static java.util.Collection<java.lang.Long> getProperDivisors(long l) {
    java.util.Set<java.lang.Long> factors = com.github.nhirakawa.MathUtils.getFactors(l);
    factors.remove(l);
    return factors;
}