public fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder fromUpdateDate(final java.util.Date begin) {
    this.filters.put(fr.visian.vip.client.sdk.request.filter.QueryFilterBuilder.Filter.FROM_UPDATE_DATE.name(), this.df.format(begin));
    return this;
}