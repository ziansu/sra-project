public static boolean validateUniqueCustomer(java.lang.String internationalID) throws java.sql.SQLException {
    java.sql.ResultSet resultSet = logic.RealCustomerLogic.connection.createStatement().executeQuery(("SELECT * FROM real_customer WHERE international_id=" + internationalID));
    if (!(resultSet.next())) {
        return false;
    }
    return true;
}