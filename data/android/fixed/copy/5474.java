public static java.sql.Connection getStoredConnection(javax.servlet.ServletRequest request) {
    return ((java.sql.Connection) (request.getAttribute(ultis.MyUtils.ATT_NAME_CONNECTION)));
}