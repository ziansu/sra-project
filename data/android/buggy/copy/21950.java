@java.lang.Override
public boolean remove(ua.kobzev.theatre.domain.User user) {
    int result = jdbcOperations.update("DELETE FROM users WHERE id =?", user.getId());
    return result == 0 ? false : true;
}