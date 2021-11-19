public com.progressoft.jip.payment.account.AccountDTO getById(int id) {
    com.progressoft.jip.payment.account.AccountDTO account = accountDAO.getById(id);
    return getIBAN(account);
}