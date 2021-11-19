@org.junit.Before
public void init() throws java.lang.Exception {
    schemaContext = org.opendaylight.controller.md.sal.rest.common.TestRestconfUtils.loadSchemaContext("/restconf/parser/deserializer");
}