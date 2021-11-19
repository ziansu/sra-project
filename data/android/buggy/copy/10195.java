@be.koencorstjens.springsecurity.testproject.controllers.RequestMapping(value = "/create", method = RequestMethod.POST)
public java.lang.String createPost(@be.koencorstjens.springsecurity.testproject.controllers.ModelAttribute
be.koencorstjens.springsecurity.testproject.dto.projectDto project, org.springframework.ui.Model model) {
    project = projectService.create(project);
    java.lang.Long id = project.getId();
    return "redirect:/project/" + id;
}