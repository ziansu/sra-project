@java.lang.Override
protected void updateRates() {
    log.debug("Inside updateRates of DBSRateProviderImpl");
    rates.setBaseCurrency(Currency.SGD);
    updateListOfCurrencies();
    try {
        fetchRates();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}