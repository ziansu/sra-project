public java.util.List<com.smi.travel.datalayer.view.entity.OutputTaxView> SearchOutputTaxViewFromFilter(java.lang.String from, java.lang.String to, java.lang.String department, java.lang.String status, java.lang.String type) {
    return postSaleVatDao.SearchOutputTaxViewFromFilter(from, to, department, status, type);
}