private static com.groupon.lex.metrics.history.xdr.support.reader.FileReader wrapGzip(com.groupon.lex.metrics.history.xdr.support.reader.FileReader in, boolean gzipped) throws java.io.IOException {
    if (gzipped)
        in = new com.groupon.lex.metrics.history.xdr.support.reader.GzipReader(in, false);
    
    return in;
}