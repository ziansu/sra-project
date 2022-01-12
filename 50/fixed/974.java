private static void writeAccount(com.github.otbproject.otbproject.api.Account account) {
    com.github.otbproject.otbproject.util.JsonHandler.writeValue(com.github.otbproject.otbproject.api.APIConfig.getAccountPath(), account);
}