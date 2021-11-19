public void setDataSource(javax.sql.DataSource dataSource) {
    this.dataSource = dataSource;
    this.jdbcTemplateObject = new org.springframework.jdbc.core.JdbcTemplate(dataSource);
}