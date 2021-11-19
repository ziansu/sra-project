@org.springframework.context.annotation.Bean
public javax.sql.DataSource datasource(@org.springframework.beans.factory.annotation.Value(value = "${spring.datasource.url}")
java.lang.String url, @org.springframework.beans.factory.annotation.Value(value = "${spring.datasource.username}")
java.lang.String userName, @org.springframework.beans.factory.annotation.Value(value = "${spring.datasource.password}")
java.lang.String passWord) throws java.sql.SQLException {
    return createDataSource(url, userName, passWord);
}