public static void debug(final java.lang.String message, final java.lang.String bundleId) {
    final org.eclipse.e4.core.services.log.Logger logger = org.bonitasoft.studio.common.log.BonitaStudioLog.getLogger(bundleId);
    if (logger != null) {
        logger.info(message);
    }else {
        java.lang.System.out.println(message);
    }
}