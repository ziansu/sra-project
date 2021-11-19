@org.springframework.context.annotation.Bean
public javax.sql.DataSource dataSource() {
    com.mysql.jdbc.jdbc2.optional.MysqlDataSource dataSource = new com.mysql.jdbc.jdbc2.optional.MysqlDataSource();
    dataSource.setServerName("localhost");
    dataSource.setUser("root");
    dataSource.setPassword("");
    dataSource.setDatabaseName("sandvigbookstore");
    return dataSource;
}