private void locateCatalog(java.lang.StringBuilder basePath) {
    java.io.File d = new java.io.File(basePath.toString());
    if (!(d.exists())) {
        d.mkdir();
        logger.info("The catalog folder of this file has been created yet.");
    }
}