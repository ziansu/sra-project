@org.junit.Before
public void setup() throws java.lang.Exception {
    java.lang.String resource = "SqlMapConfig.xml";
    java.io.InputStream inputStream = org.apache.ibatis.io.Resources.getResourceAsStream(resource);
    sqlSessionFactory = new org.apache.ibatis.session.SqlSessionFactoryBuilder().build(inputStream);
}