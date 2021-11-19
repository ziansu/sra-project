public static void bindPropertiesFromRequest(javax.servlet.http.HttpServletRequest request, jetbrains.buildServer.controllers.BasePropertiesBean bean) {
    jetbrains.buildServer.clouds.google.utils.PluginPropertiesUtil.bindPropertiesFromRequest(request, bean, false);
}