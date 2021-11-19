public nbaquery.data.sql.MutableSqlRow createRow() {
    return new nbaquery.data.sql.MutableSqlRow(this, this.insertionQuery, this.columns.size());
}