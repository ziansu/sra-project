@org.springframework.context.annotation.Bean(name = "dataSource")
public javax.sql.DataSource getDataSource() {
    javax.sql.DataSource dataSource = createDataSource();
    org.springframework.jdbc.datasource.init.DatabasePopulatorUtils.execute(createDatabasePopulator(), dataSource);
    return dataSource;
}