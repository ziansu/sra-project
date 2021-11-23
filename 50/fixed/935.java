public static java.io.File makeTempFile(java.net.URI id, java.io.File temp_dir) throws java.io.IOException {
    temp_dir.mkdirs();
    java.io.File tempfile = java.io.File.createTempFile(dk.statsbiblioteket.metadatarepository.xmltapes.common.TapeUtils.encode(id), dk.statsbiblioteket.metadatarepository.xmltapes.common.TapeUtils.GZ, temp_dir);
    return tempfile;
}