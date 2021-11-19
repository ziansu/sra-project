@org.springframework.web.bind.annotation.RequestMapping(value = { "/" })
public java.lang.String index(org.springframework.ui.Model model) {
    categoriesCreated = true;
    return "index";
}