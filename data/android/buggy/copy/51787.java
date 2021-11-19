public static java.lang.String createFullClassName(java.lang.String className, java.lang.String subclassname) {
    if (className.equalsIgnoreCase("admin_level")) {
        return "ohdm_boundary_adminlevel_" + subclassname;
    }
    return (className + "_") + subclassname;
}