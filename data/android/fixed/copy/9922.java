@Bean
@org.springframework.boot.context.properties.ConfigurationProperties(prefix = "spring.datasource.hikari")
public javax.sql.DataSource dataSource(org.springframework.boot.autoconfigure.jdbc.DataSourceProperties dataSourceProperties) {
}