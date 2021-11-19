@org.springframework.web.bind.annotation.RequestMapping(value = "/")
public java.lang.String index(org.springframework.ui.Model model) {
    java.lang.String pageTitle = "Hello";
    java.lang.String dog = "world";
    model.addAttribute("pageTitle", pageTitle);
    model.addAttribute("dog", dog);
    return "index";
}