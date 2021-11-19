public int getCurrentIdx() throws java.sql.SQLException {
    return ((int) (GetDB().queryForObject("getCurrentIdx", null)));
}