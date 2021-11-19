@com.at.ac.tuwien.sepm.ss15.edulium.dao.Test(expected = com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException.class)
public void testDelete_shouldFailWhenIdentityIsMissing() throws com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException {
    com.at.ac.tuwien.sepm.ss15.edulium.domain.Invoice invoice = new com.at.ac.tuwien.sepm.ss15.edulium.domain.Invoice();
    try {
        invoiceDAO.delete(invoice);
    } catch (com.at.ac.tuwien.sepm.ss15.edulium.dao.DAOException e) {
        fail("DAOException was thrown instead");
    }
}