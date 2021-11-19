@org.junit.Test
public void testGivenCase() throws java.lang.Exception {
    int knownTruncatablePrime = 3797;
    primes.getPrimes(knownTruncatablePrime);
    org.assertj.core.api.Assertions.assertThat(isPrimeTruncatableLeftAndRight(knownTruncatablePrime)).isTrue();
}