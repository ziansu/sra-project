public static void main(java.lang.String[] args) throws java.lang.Exception {
    org.springframework.context.ConfigurableApplicationContext run = org.springframework.boot.SpringApplication.run(com.redknee.Application.class, args);
    com.redknee.service.EventHandler bean = run.getBean(com.redknee.service.EventHandler.class);
    bean.handleMessage(new com.redknee.rest.dto.EventDto());
}