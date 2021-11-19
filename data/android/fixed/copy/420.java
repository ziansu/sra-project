@java.lang.Override
public void update() throws java.sql.SQLException {
    java.lang.String sql = "UPDATE Vendor SET name = ?, contact = ?, address1 = ?, " + ("address2 = ?, city = ?, state = ?, zip = ?, phone = ?, email = ? " + "WHERE id = ?");
    conn.executeNonQuery(sql, name, contact, address1, address2, city, state, zip, phone, email, id);
}