public java.util.List<java.lang.String> getNetworks(java.lang.String facilityName) throws NullException {
    if (this.network.isEmpty()) {
        throw new NullException("Network Details");
    }else {
        return this.network.get(facilityName);
    }
}