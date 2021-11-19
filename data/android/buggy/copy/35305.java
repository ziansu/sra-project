@java.lang.Override
public void changePassword(java.lang.String email, java.lang.String password) throws org.springframework.dao.DataAccessException {
    java.lang.String SQL = "update users set password = ? where email = ?";
    jdbcTemplateObject.update(SQL, password, email);
    java.lang.System.out.println(("Changed password for email " + email));
    return ;
}