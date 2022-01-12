public static java.util.Map<java.lang.String, java.lang.Object> priceMap(double price) {
    return new java.util.HashMap<java.lang.String, java.lang.Object>() {
        {
            put("id", 1);
            put("price", price);
        }
    };
}