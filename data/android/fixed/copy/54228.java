@io.swagger.annotations.ApiOperation(value = "Deletes a resource from the project")
@org.springframework.web.bind.annotation.RequestMapping(value = "/{projectName}", method = org.springframework.web.bind.annotation.RequestMethod.DELETE)
public void deleteProject(@io.swagger.annotations.ApiParam(value = "ProjectName", required = true)
@org.springframework.web.bind.annotation.PathVariable
java.lang.String projectName, @io.swagger.annotations.ApiParam(value = "Request", required = true)
final javax.servlet.http.HttpServletRequest request) {
    java.util.Objects.requireNonNull(projectName, "projectName must not be null");
    projectService.deleteProject(webUtils.getUserProjectName(projectName));
}