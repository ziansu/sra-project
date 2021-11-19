public java.util.List<ca.owenpeterson.twittegorize.models.User> getAllUsers() {
    java.util.List<ca.owenpeterson.twittegorize.models.User> users = java.util.Collections.emptyList();
    users = new com.activeandroid.query.Select().from(ca.owenpeterson.twittegorize.models.User.class).orderBy("Id ASC").execute();
    return users;
}