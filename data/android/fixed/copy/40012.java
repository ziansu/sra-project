void parse(com.google.api.services.bigquery.model.TableRow row, java.lang.Object object) throws java.lang.IllegalAccessException {
    parse(row.get(columnName), object);
}