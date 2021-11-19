@org.junit.BeforeClass
public static void setup() {
    com.datapine.TestSecurity.applicationContext = new org.springframework.context.support.ClassPathXmlApplicationContext("META-INF/spring/applicationSecurity.xml");
    com.datapine.TestSecurity.userDetailsService = com.datapine.TestSecurity.applicationContext.getBean(org.springframework.security.provisioning.InMemoryUserDetailsManager.class);
}