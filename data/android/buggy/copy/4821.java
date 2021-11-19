@java.lang.Override
public java.lang.Object format(java.lang.Object value) {
    if (value instanceof pl.nask.hsn2.wrappers.HsnContext) {
        pl.nask.hsn2.wrappers.HsnContext context = ((pl.nask.hsn2.wrappers.HsnContext) (value));
        return ("\"" + (context.getJobId())) + "\"";
    }else {
        return value;
    }
}