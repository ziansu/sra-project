protected <T extends org.anarres.dhcp.v6.options.Dhcp6Option> void assertSingle(org.anarres.dhcp.v6.options.Dhcp6Options options, @javax.annotation.Nonnull
final java.lang.Class<T> type) {
    org.junit.Assert.assertEquals(1, com.google.common.collect.Iterables.size(options.getAll(org.anarres.dhcp.v6.options.StatusCodeOption.class)));
}