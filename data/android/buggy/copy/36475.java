private void writeHeader(com.sbd.procscuola.ListaTestiProcessor.FileInfo f) throws java.io.IOException {
    com.sbd.procscuola.db.CSVUtils.writeLine(f.writer, this.header, ';', '"');
}