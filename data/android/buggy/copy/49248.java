public java.net.URI getProcessBaseUriForExistingProcess(java.lang.Process process) {
    java.lang.String pfad = process.getId().toString();
    pfad = (pfad.replaceAll(" ", "__")) + "/";
    return java.net.URI.create(pfad);
}