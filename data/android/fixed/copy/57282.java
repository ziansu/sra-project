public static void export(org.jbibtex.BibTeXDatabase db) throws java.io.FileNotFoundException, java.io.IOException, java.io.UnsupportedEncodingException {
    java.lang.String path = fi.cyborgducks.biblexrefmanager.exporters.BibExporter.ChooseFile();
    if (path == null) {
        return ;
    }
    fi.cyborgducks.biblexrefmanager.exporters.BibExporter.exportStub(db, path);
}