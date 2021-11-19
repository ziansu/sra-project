public static gr.ntua.ivml.edmvalidation.xsd.ReportErrorHandler validateAgainstEdm(java.lang.String fname, boolean validateXsd, boolean validateSchematron) {
    return gr.ntua.ivml.edmvalidation.EdmSchemaValidator.validateAgainstEdm(gr.ntua.ivml.edmvalidation.util.StringUtils.resolveNameToInputStream(fname), validateXsd, validateSchematron);
}