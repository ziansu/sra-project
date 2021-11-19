public static void main(java.lang.String[] args) {
    java.lang.System.setProperty("http.agent", com.fsmith.mondo.MondoApplication.USER_AGENT);
    org.springframework.boot.SpringApplication.run(com.fsmith.mondo.MondoApplication.class, args);
}