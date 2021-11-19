public static void main(java.lang.String[] args) {
    org.springframework.context.ApplicationContext context = org.springframework.boot.SpringApplication.run(my.simple.service.app.MyApp.class, args);
    java.lang.System.out.println(("My countries web service has started, context ID : " + (context.getId())));
}