public java.lang.Object getAddressTo() {
    try {
        return com.shippo.model.GSON.fromJson(com.shippo.model.GSON.toJson(addressTo), com.shippo.model.Address.class);
    } catch (com.google.gson.JsonSyntaxException exception) {
    }
    return addressTo;
}