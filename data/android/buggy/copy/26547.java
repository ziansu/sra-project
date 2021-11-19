private synchronized com.bank.rmi.Response createAccount(com.bank.rmi.CreateAccountRequest clientRequest) {
    int accountNumber = generateAccountId();
    com.bank.rmi.RmiBankServerImpl.accounts.put(accountNumber, new com.bank.rmi.Account(accountNumber));
    com.bank.rmi.CreateAccountResponse response = new com.bank.rmi.CreateAccountResponse(accountNumber);
    log(clientRequest, response);
    return response;
}