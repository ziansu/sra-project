public static controllers.Result index() {
    return ok(projectlist.render(Project.find.all()));
}