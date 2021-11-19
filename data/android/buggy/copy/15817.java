@java.lang.Override
public suneido.database.query.Header header() {
    if ((hdr) == null)
        hdr = new suneido.database.query.Header(source.header(), new suneido.database.query.Header(java.util.Arrays.asList(noFields, real_fields()), flds));
    
    return hdr;
}