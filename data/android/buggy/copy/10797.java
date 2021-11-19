@com.at.ac.tuwien.sepm.ss15.edulium.dao.Test(expected = com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException.class)
public void testUpdate_shouldFailWhenObjectIsNull() throws com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException {
    com.at.ac.tuwien.sepm.ss15.edulium.domain.Invoice invoice = null;
    try {
        invoiceDAO.update(invoice);
    } catch (com.at.ac.tuwien.sepm.ss15.edulium.dao.DAOException e) {
        fail("DAOException was thrown instead");
    }
}