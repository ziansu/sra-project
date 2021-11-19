public static io.reactivex.functions.Predicate<com.github.e13mort.stf.model.device.Device> provider(com.github.e13mort.stf.adapter.filters.ProviderDescription description) {
    com.github.e13mort.stf.adapter.filters.ProviderStringParser parser = new com.github.e13mort.stf.adapter.filters.ProviderStringParser();
    return new com.github.e13mort.stf.adapter.filters.ProviderPredicate(description.getType(), description.getTemplates());
}