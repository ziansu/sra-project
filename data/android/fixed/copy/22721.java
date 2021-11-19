public com.excilys.dao.util.QueryBuilder offset(java.lang.String offset) {
    queryContent.append("OFFSET ").append(offset).append(" ");
    return this;
}