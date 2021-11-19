public com.shtrih.fiscalprinter.ReadCashRegister readCashRegister2(int number) throws java.lang.Exception {
    com.shtrih.fiscalprinter.SMFiscalPrinterImpl.logger.debug("readCashRegister");
    com.shtrih.fiscalprinter.ReadCashRegister command = new com.shtrih.fiscalprinter.ReadCashRegister(usrPassword, number);
    executeCommand(command);
    return command;
}