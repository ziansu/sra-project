public static void index() {
    models.User user = models.User.find("byNickname", controllers.Security.connected()).first();
    java.util.List<models.User> contacts = user.following;
    render(contacts);
}