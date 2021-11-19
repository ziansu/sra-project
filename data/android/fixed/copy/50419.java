@java.lang.Override
public org.spring.batch.infrastructure.model.Transaction process(org.spring.batch.infrastructure.model.Transaction transaction) throws java.lang.Exception {
    if (throwException) {
        throwException = false;
        org.spring.batch.infrastructure.processors.ThrowingExceptionProcessor.LOGGER.error("ThrowingExceptionProcessor throws Exception", new java.lang.IllegalArgumentException());
        throw new java.lang.IllegalArgumentException();
    }
    org.spring.batch.infrastructure.processors.ThrowingExceptionProcessor.LOGGER.info("ThrowingExceptionProcessor for transaction invoked");
    return transaction;
}