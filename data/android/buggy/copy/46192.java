public fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder strictlyBetween(final double start, final double end) {
    this.filters.put(fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder.Filter.GREATER.name(), start);
    this.filters.put(fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder.Filter.LOWER.name(), end);
    return this;
}