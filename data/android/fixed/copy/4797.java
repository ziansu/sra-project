@org.springframework.web.bind.annotation.RequestMapping(value = "/addEmployee", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String addDepartment(@org.springframework.web.bind.annotation.RequestParam(value = "depID")
java.lang.Long depID, org.springframework.ui.Model model) {
    model.addAttribute("depID", depID);
    return "empEdit";
}