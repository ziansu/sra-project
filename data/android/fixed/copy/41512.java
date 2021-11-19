@java.lang.Override
public java.lang.Integer save(final com.skizware.user.User user) {
    java.lang.Integer userId = jdbcTemplate.update(java.lang.String.format(com.skizware.money.tracker.persistence.repository.impl.UserRepositoryImpl.SQL_USER_INSERT, user.getEmailAddress()));
    return userId;
}