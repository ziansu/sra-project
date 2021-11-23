@org.springframework.web.bind.annotation.RequestMapping(value = "/lectures", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String getClasses(org.springframework.ui.Model model, javax.servlet.http.HttpServletRequest request) {
    if (canCreate(request))
        model.addAttribute("canCreate", true);
    
    model.addAttribute("lecture", new it.unical.classmanager.model.data.Lecture());
    return getLectures(model, request);
}