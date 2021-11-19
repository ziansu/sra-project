@org.springframework.web.bind.annotation.RequestMapping(value = "/getlist.do")
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.String getProjectsList(@org.springframework.web.bind.annotation.RequestParam(value = "offset", required = true)
int offset, @org.springframework.web.bind.annotation.RequestParam(value = "limit", required = true)
int limit) {
    java.util.List<com.myproject.model.Project> list = projectService.getProjectsList(offset, limit);
    return list.toString();
}