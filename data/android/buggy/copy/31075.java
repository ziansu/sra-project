public static void main(java.lang.String[] args) {
    org.springframework.context.ConfigurableApplicationContext context = org.springframework.boot.SpringApplication.run(com.softserve.edu.delivery.Application.class, args);
    context.getBean(com.softserve.edu.delivery.Application.DBInit.class).init();
}