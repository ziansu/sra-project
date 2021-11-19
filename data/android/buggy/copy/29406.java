public int getCurrentIdx() throws java.sql.SQLException {
    java.lang.System.out.println("in");
    return ((int) (GetDB().queryForObject("getCurrentIdx", null)));
}