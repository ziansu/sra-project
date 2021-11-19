@java.lang.Override
public ru.tiger.bookprototype.entity.User findByUsername(java.lang.String username) {
    ru.tiger.bookprototype.entity.User user = userDao.findByUsername(username);
    return user;
}