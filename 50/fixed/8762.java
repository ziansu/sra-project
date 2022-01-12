public void addError(org.dnal.core.ErrorType errType, java.lang.String message) {
    org.dnal.core.NewErrorMessage nem = new org.dnal.core.NewErrorMessage();
    nem.setErrorName(errType.name());
    nem.setMessage(message);
    addError(nem);
}