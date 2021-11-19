@org.springframework.web.bind.annotation.RequestMapping(value = "/company/list")
public java.lang.String list(org.springframework.ui.Model model) {
    model.addAttribute("company", companyService.findAll());
    return "company/list";
}