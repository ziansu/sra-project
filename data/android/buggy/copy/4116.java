public static java.lang.String getUserNameValidationErrorMessage(java.lang.String userName) {
    com.google.common.base.Preconditions.checkState((!(games.strategy.engine.lobby.server.userDB.DbUser.isValidUserName(userName))));
    return games.strategy.engine.lobby.server.userDB.DbUser.userNameValidation(userName);
}