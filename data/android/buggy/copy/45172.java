public static void main(java.lang.String[] args) {
    org.springframework.boot.SpringApplication app = new org.springframework.boot.SpringApplication(fi.hsl.parkandride.Application.class);
    app.addListeners(new org.springframework.boot.actuate.system.ApplicationPidListener());
    app.addListeners(new fi.hsl.parkandride.config.SpringNameToSystemNameMapper());
    app.run(args);
}