public static void main(java.lang.String[] args) throws java.lang.Exception {
    com.tech.configurations.InitializeValidators.InitializeCustomValidators();
    java.lang.Thread tmp = new java.lang.Thread(new com.tech.configurations.tools.MessageDeleter());
    tmp.start();
    org.springframework.boot.SpringApplication.run(com.tech.Application.class, args);
}