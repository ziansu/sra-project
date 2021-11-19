@org.junit.Test
public void testGivenCase() throws java.lang.Exception {
    primes = new com.rhejinald.euler.lib.Primes();
    int knownTruncatablePrime = 3797;
    primes.getPrimes(knownTruncatablePrime);
    org.assertj.core.api.Assertions.assertThat(isPrimeTruncatableLeftAndRight(knownTruncatablePrime)).isTrue();
}