@org.junit.Test
public void deserializeEmptyDataTest() {
    final java.lang.Iterable<org.opendaylight.yangtools.yang.data.api.YangInstanceIdentifier.PathArgument> result = org.opendaylight.restconf.parser.builder.YangInstanceIdentifierDeserializer.create(schemaContext, "");
    org.junit.Assert.assertTrue("Empty result expected", com.google.common.collect.Iterables.isEmpty(result));
}