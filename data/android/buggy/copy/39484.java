public fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder sensortype(final int id) {
    this.filters.put(fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder.Filter.SENSORTYPE.name(), id);
    return this;
}