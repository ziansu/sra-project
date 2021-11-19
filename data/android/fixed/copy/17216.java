@javax.annotation.PostConstruct
public void init() throws java.sql.SQLException {
    dbui = org.h2.tools.Server.createWebServer().start();
}