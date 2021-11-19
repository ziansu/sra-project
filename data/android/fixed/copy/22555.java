private javax.mail.Message[] searchMailbox(javax.mail.Folder folder) throws javax.mail.MessagingException {
    java.util.Date lastParseDate = getLastParseDate(preferences.getString(MainActivity.MOST_RECENT_DATE_KEY, MainActivity.NULL_KEY));
    return folder.search(getSearchTerm(lastParseDate, false));
}