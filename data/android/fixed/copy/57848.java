@org.springframework.web.bind.annotation.RequestMapping(value = "/index")
public java.lang.String index(org.springframework.ui.ModelMap model) {
    model.addAttribute("message", "你好");
    return "hello";
}