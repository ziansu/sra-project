public amazon.db.query.OrderMatch.OrderMatchResult check(javax.xml.datatype.XMLGregorianCalendar createdAfter, javax.xml.datatype.XMLGregorianCalendar createdBefore) {
    return check(java.sql.Time.getTimeInPST(createdAfter), java.sql.Time.getTimeInPST(createdBefore));
}