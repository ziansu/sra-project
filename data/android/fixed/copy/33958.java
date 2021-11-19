@java.lang.Override
protected void configureMariaDB4jSpringService(ch.vorburger.mariadb4j.springframework.MariaDB4jSpringService s) {
    s.setDefaultPort(5677);
    s.setDefaultBaseDir("target/MariaDB4jSpringServiceOverrideBySetTest/baseDir");
    s.setDefaultDataDir("target/MariaDB4jSpringServiceOverrideBySetTest/dataDir");
}