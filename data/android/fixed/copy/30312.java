public static void main(java.lang.String[] args) throws java.io.IOException {
    java.util.List<com.swindonviewpoint.svpcatalog.Entry> catalog = com.swindonviewpoint.svpcatalog.SVPCatalog.generateCatalog(args);
    if (catalog != null) {
        com.swindonviewpoint.svpcatalog.SVPCatalog.outputCatalog(catalog, args);
    }
}