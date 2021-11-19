private boolean log(java.lang.Object object) {
    if (shouldLogF.test(object)) {
        logger.info(toStringF.apply(object));
    }
    return true;
}