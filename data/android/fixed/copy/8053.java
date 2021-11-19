private static void setEmailLastSentDate(keepinchecker.database.entity.User user) throws java.lang.Exception {
    user.setEmailLastSentDate(new java.util.Date().getTime());
    keepinchecker.utility.EmailUtilities.userManager.saveUser(user);
}