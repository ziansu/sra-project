private <T> void assertSetEquals(java.util.Set<T> expected, java.util.Set<T> actual) {
    org.junit.Assert.assertArrayEquals(expected.toArray(), actual.toArray());
}