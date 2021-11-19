@org.springframework.transaction.annotation.Transactional(propagation = org.springframework.transaction.annotation.Propagation.REQUIRED, rollbackFor = java.lang.Exception.class)
public void saveInvoiceRecipient(org.iabako.server.serviceimpl.business.Client client, org.iabako.server.serviceimpl.business.InvoiceRecipient invoiceRecipient) {
    clientDAO.saveInvoiceRecipient(client, invoiceRecipient);
}