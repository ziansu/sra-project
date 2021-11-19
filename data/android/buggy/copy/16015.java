public ninja.Result getUploadTemplateForm(@ai.subut.kurjun.web.security.AuthorizedUser
ai.subut.kurjun.model.identity.UserSession userSession) {
    java.util.List<java.lang.String> repos = repositoryService.getRepositories();
    return ninja.Results.html().template("views/_popup-add-tpl.ftl").render("repos", repos);
}