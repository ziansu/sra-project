public static com.github.otbproject.otbproject.api.Account readAccount() {
    com.github.otbproject.otbproject.api.Account account = com.github.otbproject.otbproject.api.ConfigValidator.validateAccount(com.github.otbproject.otbproject.util.JsonHandler.readValue(com.github.otbproject.otbproject.api.APIConfig.getAccountPath(), com.github.otbproject.otbproject.api.Account.class));
    com.github.otbproject.otbproject.api.APIConfig.writeAccount(account);
    return account;
}