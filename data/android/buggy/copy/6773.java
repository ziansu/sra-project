public static gr.ntua.ivml.edmvalidation.xsd.ReportErrorHandler validateAgainstEdm(java.io.File file, boolean validateXsd, boolean validateSchematron) {
    return gr.ntua.ivml.edmvalidation.EdmSchemaValidator.validateAgainstEdm(new javax.xml.transform.stream.StreamSource(file), validateXsd, validateSchematron);
}