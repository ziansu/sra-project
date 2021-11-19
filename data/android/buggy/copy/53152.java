@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String printHello(org.springframework.ui.ModelMap model) {
    java.lang.System.out.println("test success");
    return "index";
}