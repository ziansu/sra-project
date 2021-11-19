public static void like(java.lang.Integer id, int stars, java.lang.String comment) {
    if (controllers.Application.loggedIn()) {
        controllers.Application.service.like(id, controllers.Application.email(), stars, comment);
    }
    controllers.Application.show(id);
}