public void deleteUser(java.lang.String name) {
    del(name);
    zrem(com.sincetimes.website.app.security.vo.redis.UserProvider.USERS_SET, name);
}