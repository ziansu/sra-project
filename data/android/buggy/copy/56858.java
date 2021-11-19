@org.springframework.web.bind.annotation.RequestMapping(value = { "/" , "/home" })
public java.lang.String home() {
    java.lang.System.out.println("home crtlr");
    return "Home";
}