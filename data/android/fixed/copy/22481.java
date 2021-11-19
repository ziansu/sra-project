@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String getPrimary(org.springframework.ui.Model model) {
    model.addAttribute(new demo.model.primary.PrimaryModel());
    return "primary";
}