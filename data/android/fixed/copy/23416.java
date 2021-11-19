public static void main(java.lang.String[] args) throws java.sql.SQLException {
    org.h2.tools.Server.createTcpServer("-tcpAllowOthers").start();
    org.springframework.boot.SpringApplication.run(com.tf.TfDatabaseApplication.class, args);
}