public java.lang.String saveUser(beans.User user) {
    services.impl.UserServiceImplMemory.users.put(user.getId(), user);
    return "success";
}