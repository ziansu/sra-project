public void clearSearchFields() {
    flowName = "";
    flowPointName = "";
    applicationName = "";
    transactionReferenceId = "";
    this.freeTextSearch = new com.erbjuder.logger.server.common.helper.FreeTextSearchController();
    this.search();
}