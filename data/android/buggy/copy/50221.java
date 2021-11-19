@org.springframework.web.bind.annotation.RequestMapping(value = "/invoice", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String greetingForm(org.springframework.ui.Model model) {
    model.addAttribute("invoice", new form.Invoice());
    return "greeting";
}