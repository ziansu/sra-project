public static boolean updateCompany(java.lang.String name, java.lang.String symbol) {
    services.Company c = services.Company.getCompanyBySymbol(symbol);
    if (c != null) {
        c.setName(name);
        return true;
    }
    return false;
}