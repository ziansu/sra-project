public com.mx.kanjo.openclothes.model.NotificationOrderRequest createNewSale(com.mx.kanjo.openclothes.model.SaleModel sale, com.mx.kanjo.openclothes.model.ConfigurationOrder configurationOrder) {
    return createNewSale(sale, resolver, configurationOrder, false);
}