@java.lang.Override
public int insertUser(appl.data.items.User user) throws exceptions.data.PrimaryKeyViolation {
    return ((java.lang.Integer) (getSession().save(user)));
}