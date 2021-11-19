private java.lang.String convertDateToString(java.util.Date date) {
    java.text.SimpleDateFormat DATE_FORMAT = new java.text.SimpleDateFormat(org.hisp.dhis.client.sdk.core.event.EventFilters.AMERICAN_DATE_FORMAT);
    return DATE_FORMAT.format(date);
}