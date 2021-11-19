static void registerShutdownHook(final org.openbase.jul.iface.Shutdownable shutdownable) {
    java.lang.Runtime.getRuntime().addShutdownHook(new org.openbase.jul.iface.Shutdownable.ShutdownDeamon(shutdownable, 0));
}