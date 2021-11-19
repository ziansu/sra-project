public void updateUser(java.lang.Long id, java.lang.String email, java.lang.String password) {
    java.lang.String sql = "UPDATE user SET email = ?, password = ? WHERE id = ?";
    this.jdbcTemplate.update(sql, email, password, id);
}