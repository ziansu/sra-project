public static void main(java.lang.String[] args) {
    org.springframework.context.ConfigurableApplicationContext applicationContext = org.springframework.boot.SpringApplication.run(uk.co.serin.thule.config.Application.class, args);
    applicationContext.close();
}