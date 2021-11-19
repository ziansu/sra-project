@org.junit.After
public void tearDown() {
    schemaExport.drop(java.util.EnumSet.of(TargetType.DATABASE), metadata);
    org.hibernate.boot.registry.StandardServiceRegistryBuilder.destroy(ssr);
}