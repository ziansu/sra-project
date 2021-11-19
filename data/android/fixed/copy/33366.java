public void transferir() {
    command = new Command.Transfer(account_destine, account_origin, password, value, msg);
    command.execute();
}