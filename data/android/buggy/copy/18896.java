private void onInitContext() {
    com.canoo.dolphin.server.context.DolphinContext.LOG.debug(("Initializing DolphinContext " + (getId())));
    platformBeanRepository = new com.canoo.dolphin.server.impl.ServerPlatformBeanRepository(dolphin, beanRepository, dispatcher, converters);
}