@org.junit.Test
public void nullDataNegativeNegativeTest() {
    this.thrown.expect(java.lang.NullPointerException.class);
    org.opendaylight.restconf.parser.builder.YangInstanceIdentifierDeserializer.create(this.schemaContext, null);
}