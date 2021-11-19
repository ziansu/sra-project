@main.java.rest.POST
@main.java.rest.Path(value = "{username}/{message}")
public void addKweet(@main.java.rest.PathParam(value = "username")
java.lang.String username, @main.java.rest.PathParam(value = "message")
java.lang.String message) {
    main.java.domain.User user = userService.findByName(username);
    main.java.domain.Kweet newKweet = new main.java.domain.Kweet(user, message);
    kweetService.addKweet(newKweet);
}