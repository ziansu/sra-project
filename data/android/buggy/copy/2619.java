public static void main(java.lang.String[] args) {
    RMI.Server server = new RMI.Server();
    RMI.BankComponent bank = new RMI.BankComponent(200);
    server.addComponent(ComponentKeys.BANK_KEY, bank);
    RMI.Server.main(args);
}