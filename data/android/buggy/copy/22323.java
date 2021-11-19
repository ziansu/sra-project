public com.icegreen.greenmail.configuration.GreenMailConfiguration withUser(final java.lang.String login, final java.lang.String password) {
    this.usersToCreate.add(new com.icegreen.greenmail.configuration.UserBean(login, login, password));
    return this;
}