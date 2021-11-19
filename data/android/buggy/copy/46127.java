public static com.github.otbproject.otbproject.api.Account readAccount(java.lang.String filename) {
    com.github.otbproject.otbproject.api.Account account = com.github.otbproject.otbproject.api.ConfigValidator.validateAccount(com.github.otbproject.otbproject.util.JsonHandler.readValue(com.github.otbproject.otbproject.api.APIConfig.getAccountPath(filename), com.github.otbproject.otbproject.api.Account.class));
    com.github.otbproject.otbproject.api.APIConfig.writeAccount(account, filename);
    return account;
}