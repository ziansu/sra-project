@org.telosystools.saas.web.controller.RequestMapping(value = "/{id}/workspace/files/{fileId}", method = RequestMethod.GET)
@org.telosystools.saas.web.controller.ResponseBody
public java.lang.String getFileContent(@org.telosystools.saas.web.controller.PathVariable(value = "id")
java.lang.String projectId, @org.telosystools.saas.web.controller.PathVariable
java.lang.String fileId) {
    return workspaceService.getFileContent(projectId, fileId);
}