private void logAsErrorUnexpectedDataIntegrityException(final org.springframework.dao.DataIntegrityViolationException dve) {
    org.apache.fineract.portfolio.client.service.ClientIdentifierWritePlatformServiceJpaRepositoryImpl.logger.error(dve.getMessage(), dve);
}