private void exitApplication(java.util.Scanner scanner) {
    scanner.close();
    org.springframework.boot.SpringApplication.exit(this.context);
}