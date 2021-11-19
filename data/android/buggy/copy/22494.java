@org.springframework.web.bind.annotation.RequestMapping(value = "/users", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public boolean createUser(@org.springframework.web.bind.annotation.RequestParam(value = "name")
java.lang.String name, @org.springframework.web.bind.annotation.RequestParam(value = "email")
java.lang.String email, @org.springframework.web.bind.annotation.RequestParam(value = "password")
java.lang.String password) {
    boolean u = user.createUser(email, name, password);
    return u;
}