@org.springframework.context.annotation.Bean
public com.mysql.jdbc.jdbc2.optional.MysqlDataSource dataSource() {
    com.mysql.jdbc.jdbc2.optional.MysqlDataSource dataSource = new com.mysql.jdbc.jdbc2.optional.MysqlDataSource();
    dataSource.setServerName("localhost");
    dataSource.setUser("root");
    dataSource.setPassword("");
    return dataSource;
}