public static int getPriceSchema(eu.ascetic.utils.ovf.api.ProductSection productSection) {
    java.lang.String priceSchema = productSection.getPriceSchema();
    if (priceSchema == null) {
        return -1;
    }
    return java.lang.Integer.parseInt(priceSchema);
}