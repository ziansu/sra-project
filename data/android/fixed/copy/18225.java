@com.semvalidator.controllers.RequestMapping(value = "/questions/add", method = RequestMethod.GET)
public java.lang.String showAddForm(org.springframework.ui.Model model) {
    model.addAttribute("question", new com.semvalidator.model.Question());
    model.addAttribute("criterions", criterionService.findAll());
    return "questions/form";
}