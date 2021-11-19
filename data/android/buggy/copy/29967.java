@org.springframework.web.bind.annotation.RequestMapping(value = "/users", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public domain.User getUser(@org.springframework.web.bind.annotation.RequestParam(value = "email")
java.lang.String email) {
    nu.monaden.User u = user.getUser(email);
    java.lang.System.out.println(u);
    return u;
}