@java.lang.Override
public boolean register(ua.kobzev.theatre.domain.User user) {
    int result = jdbcOperations.update("INSERT into users(name,email,birthDay) VALUES (?,?,?)", user.getName(), user.getEmail(), user.getBirthDay());
    return result != 0;
}