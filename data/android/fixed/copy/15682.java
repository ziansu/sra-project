public static controllers.Result index(java.lang.Long id) {
    return ok(votepage.render(Project.find.byId(id)));
}