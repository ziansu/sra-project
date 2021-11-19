private static void checkType(java.lang.String type) throws java.lang.IllegalArgumentException {
    if (type == null) {
        throw new java.lang.NullPointerException("The type of the transaction cannot be null");
    }else
        if (model.Transaction.isValidType(type)) {
            throw new java.lang.IllegalArgumentException("The type of the transaction must be an existing type");
        }
    
}