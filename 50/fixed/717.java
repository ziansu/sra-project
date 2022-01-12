private void log(java.lang.Object object) {
    if ((object != null) && (shouldLogF.test(object))) {
        logger.info(toStringF.apply(object));
    }
}