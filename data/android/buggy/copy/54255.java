public java.util.List<java.lang.String> getMessages() {
    if (user.User.dbMessages.containsKey(username)) {
        return user.User.dbMessages.get(username);
    }else {
        return new java.util.ArrayList<java.lang.String>();
    }
}