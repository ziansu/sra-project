public edu.unc.lib.dl.fcrepo4.FileObject addDataFile(java.lang.String filename, java.io.InputStream contentStream, java.lang.String mimetype, java.lang.String sha1Checksum) {
    edu.unc.lib.dl.fedora.PID fileObjPid = repository.mintContentPid();
    return addDataFile(fileObjPid, contentStream, filename, mimetype, sha1Checksum);
}