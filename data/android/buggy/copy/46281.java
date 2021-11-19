public void endRDF() throws org.openrdf.rio.RDFHandlerException {
    if (!(writingStarted)) {
        throw new java.lang.RuntimeException("Document writing has not yet started");
    }
    this.sb = new java.lang.StringBuilder(sb.capacity());
}