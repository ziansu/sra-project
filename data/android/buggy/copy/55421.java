@java.lang.Override
public void validate(java.lang.Integer productID, java.lang.String mail, java.lang.Integer quantity, java.lang.Integer prodpackID) {
    validateProductID(productID);
    validateMail(mail);
    validateQuantity(quantity);
    validateProdpackID(prodpackID);
}