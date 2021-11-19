@it.sevenbits.FacultySite.web.controllers.RequestMapping(value = "/upload", method = RequestMethod.POST)
public java.lang.String handleFileUpload(@it.sevenbits.FacultySite.web.controllers.RequestParam(value = "files", required = false)
java.util.List<org.springframework.web.multipart.MultipartFile> files, org.springframework.ui.Model model) {
    if (!(org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication().getName().equals("root")))
        return "redirect:/main";
    
    return "redirect:/main";
}