public com.progressoft.jip.payment.account.AccountDTO getById(int id) {
    com.progressoft.jip.payment.account.AccountDTO account = accountDAO.getById(id);
    com.progressoft.jip.payment.account.AccountDTOImpl accountDTO = getIBAN(account);
    return accountDTO;
}