@java.lang.Override
public void changeConfirmation(java.lang.String email, boolean isConfirmed) throws org.springframework.dao.DataAccessException {
    java.lang.String SQL = "update users set is_confirmed = ? where email = ?";
    jdbcTemplateObject.update(SQL, isConfirmed, email);
    java.lang.System.out.println(("Changed password for email " + email));
    return ;
}