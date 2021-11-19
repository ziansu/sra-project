public static void main(java.lang.String[] args) {
    com.dutytrail.frontend.api.starter.Api.configureHystrix();
    org.springframework.boot.SpringApplication.run(com.dutytrail.frontend.api.starter.Api.class, args);
}