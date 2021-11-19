public services.impl.Sring saveUser(beans.User u) {
    services.impl.UserServiceImplMemory.users.put(user.getId(), user);
    return "success";
}