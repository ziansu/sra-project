@org.springframework.context.annotation.Bean
public javax.sql.DataSource dataSource() {
    log.info("Configuring JDBC datasource from a cloud provider");
    return connectionFactory().dataSource();
}