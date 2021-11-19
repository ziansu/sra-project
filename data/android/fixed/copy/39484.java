public fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder sensortype(final int id) {
    this.filters.put(fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder.Filter.SENSORTYPE.getName(), id);
    return this;
}