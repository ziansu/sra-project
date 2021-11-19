public edu.carleton.comp4601.project.dao.Product parseProductOfType(edu.carleton.comp4601.project.dao.ProductType type, java.lang.String url) {
    edu.carleton.comp4601.project.dao.Product product = null;
    if ((retailer.getName()) == (edu.carleton.comp4601.project.dao.RetailerName.NCIX)) {
        product = parseNCIXProduct(type, url);
    }
    return product;
}