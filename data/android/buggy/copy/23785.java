private static java.lang.String promptEnterLocalRepo(java.lang.String message) {
    it.univaq.architecture.recovery.granchelli.ArchitectureRecoveryApplication.logger.info(message);
    java.util.Scanner scanner = new java.util.Scanner(java.lang.System.in);
    java.lang.String repo = scanner.nextLine();
    scanner.close();
    return repo;
}