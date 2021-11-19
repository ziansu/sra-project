public static void writeAccount(com.github.otbproject.otbproject.api.Account account, java.lang.String filename) {
    com.github.otbproject.otbproject.util.JsonHandler.writeValue(com.github.otbproject.otbproject.api.APIConfig.getAccountPath(filename), account);
}