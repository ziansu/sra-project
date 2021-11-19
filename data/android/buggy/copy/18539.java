@org.springframework.web.bind.annotation.RequestMapping(value = "/user")
public java.lang.String user(@org.springframework.web.bind.annotation.RequestParam(value = "name", required = false)
java.lang.String name, @org.springframework.web.bind.annotation.RequestParam(value = "pwd", required = false)
java.lang.String pwd) {
    int i = 2 / 0;
    return "Hello " + name;
}