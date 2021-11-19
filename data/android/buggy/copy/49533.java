private corp.skaj.foretagskvitton.model.Company collectCompany(java.util.List<java.lang.String> strings) {
    return new corp.skaj.foretagskvitton.model.User("TEMP_USER").getCompany(java.lang.Integer.parseInt(corp.skaj.foretagskvitton.services.ReceiptScanner.getCardNumber(strings)));
}