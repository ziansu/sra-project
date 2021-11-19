protected boolean checkHandler(com.tvd12.ezyfox.core.structure.ZoneHandlerClass handler, com.tvd12.ezyfox.core.model.ApiZone apiZone, java.lang.Object userAgent) {
    return apiZone.getName().startsWith(handler.getZoneName());
}