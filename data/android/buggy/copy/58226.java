@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String displayMainPage(org.springframework.ui.ModelMap model) {
    model.addAttribute("message", "log report");
    return "main";
}