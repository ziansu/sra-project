@java.lang.Override
public void validateForDelete(com.at.ac.tuwien.sepm.ss15.edulium.domain.Invoice invoice) throws com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException {
    if (invoice == null) {
        throw new com.at.ac.tuwien.sepm.ss15.edulium.domain.validation.ValidationException("Object must not be null");
    }
    validateIdentity(invoice);
}