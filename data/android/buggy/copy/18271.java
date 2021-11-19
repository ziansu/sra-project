public static gr.ntua.ivml.edmvalidation.xsd.ReportErrorHandler validateAgainstEdm(java.io.InputStream is) {
    return gr.ntua.ivml.edmvalidation.EdmSchemaValidator.validateAgainstEdm(new javax.xml.transform.stream.StreamSource(is), true, true);
}