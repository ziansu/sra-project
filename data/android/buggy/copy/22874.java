@org.junit.Test
public void deserializeKeysEndsWithComaNegativeTest() {
    thrown.expect(java.lang.IllegalArgumentException.class);
    org.opendaylight.restconf.parser.builder.YangInstanceIdentifierDeserializer.create(schemaContext, "deserializer-test:list-multiple-keys=value,100,false,");
}