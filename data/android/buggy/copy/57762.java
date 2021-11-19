@org.springframework.web.bind.annotation.RequestMapping(value = { "/projectCreate" }, method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.String projectCreate(org.springframework.ui.ModelMap modelMap) {
    fr.epita.sigl.mepa.core.domain.Project p = new fr.epita.sigl.mepa.core.domain.Project();
    modelMap.addAttribute(fr.epita.sigl.mepa.front.controller.core.preinvest.ProjectCreateController.NEWPROJECT, p);
    projectService.getProjectById(1L).getEndDate();
    return "/preinvest/projectCreate";
}