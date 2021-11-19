public java.util.List<org.openhab.binding.zwave.internal.config.ZWaveDbProduct> GetProducts() {
    if ((selManufacturer) == null)
        return null;
    
    return selManufacturer.Product;
}