@org.springframework.web.bind.annotation.RequestMapping(value = "/", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String welcome(java.util.Map<java.lang.String, java.lang.Object> model) {
    return "home";
}