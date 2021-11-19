public com.excilys.dao.util.QueryBuilder offset(int offset) {
    queryContent.append("OFFSET ").append(offset).append(" ");
    return this;
}