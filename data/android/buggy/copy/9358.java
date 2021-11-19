public fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder lower(final double value) {
    this.filters.put(fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder.Filter.LOWER.name(), value);
    return this;
}