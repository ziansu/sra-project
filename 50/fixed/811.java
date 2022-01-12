private javax.sql.DataSource getDataSource() {
    return ((javax.sql.DataSource) (new org.springframework.context.support.ClassPathXmlApplicationContext("WEB-INF/spring-database.xml").getBean("dataSource")));
}