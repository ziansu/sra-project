@java.lang.Override
public Entity.User mapRow(java.sql.ResultSet rs, int rowNum) throws java.sql.SQLException {
    Entity.User user = new Entity.User();
    user.setUsername(rs.getString("username"));
    return user;
}