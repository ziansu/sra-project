public gr.ntua.ivml.edmvalidation.xsd.ReportErrorHandler validateAgainstEdm(java.lang.String fname) {
    return validateAgainstEdm(gr.ntua.ivml.edmvalidation.util.StringUtils.resolveNameToInputStream(fname), true, true);
}