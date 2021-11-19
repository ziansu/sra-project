@org.junit.After
public void tearDown() {
    schemaExport.drop(true, true);
    org.hibernate.boot.registry.StandardServiceRegistryBuilder.destroy(ssr);
}