public codeu.chat.common.User newUser(java.lang.String name, java.lang.String password) {
    return newUser(createId(), name, codeu.chat.common.Time.now(), password);
}