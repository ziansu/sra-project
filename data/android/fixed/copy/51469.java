@org.springframework.web.bind.annotation.RequestMapping(value = "/getcount.do")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.Integer getProjectsCount() {
    return projectService.getProjectsCount();
}