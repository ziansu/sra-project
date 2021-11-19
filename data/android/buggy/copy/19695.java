public java.lang.String pushToELK(org.vferrer.stokker.elk.StockQuotation quotation) throws java.lang.Exception {
    stockRepo.save(quotation);
    return "OK";
}