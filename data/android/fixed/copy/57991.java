@org.springframework.web.bind.annotation.RequestMapping(value = "/getbyid.do")
@org.springframework.web.bind.annotation.ResponseBody
public com.myproject.model.Project getProjectById(int id) {
    com.myproject.model.Project project = this.projectService.getProjectById(id);
    return project;
}