public static void initialize() {
    ca.q0r.sponge.mchat.api.API.service = ca.q0r.sponge.mchat.util.ServerUtil.getGame().getServiceManager().provide(org.spongepowered.api.service.permission.PermissionService.class).orNull();
    ca.q0r.sponge.mchat.api.API.spying = new java.util.HashMap<java.lang.String, java.lang.Boolean>();
}