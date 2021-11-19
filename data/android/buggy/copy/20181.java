public com.github.drinkjava2.jdialects.model.Column getColumn(java.lang.String columnName) {
    com.github.drinkjava2.jdialects.DialectException.assureNotEmpty(columnName);
    return columns.get(columnName.toUpperCase());
}