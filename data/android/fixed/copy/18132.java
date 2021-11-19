@org.springframework.web.bind.annotation.RequestMapping(value = "/tickets", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String goToRegisterPage(org.springframework.ui.Model model) {
    model.addAttribute("tags", userFacade.findAllTags());
    model.addAttribute("registrant", new site.model.Registrant());
    return "/tickets-register.jsp";
}