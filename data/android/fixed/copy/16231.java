@org.springframework.context.annotation.Bean
public javax.sql.DataSource dataSource() {
    org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder builder = new org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder();
    return builder.setType(EmbeddedDatabaseType.H2).addScript("schema.sql").addScript("data.sql").build();
}