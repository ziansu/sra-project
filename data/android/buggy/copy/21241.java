public java.lang.Object getAddressFrom() {
    try {
        return com.shippo.model.GSON.fromJson(((java.lang.String) (addressFrom)), com.shippo.model.Address.class);
    } catch (com.google.gson.JsonSyntaxException ex) {
    }
    return addressFrom;
}