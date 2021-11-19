public gr.ntua.ivml.edmvalidation.xsd.ReportErrorHandler validateAgainstEdm(java.io.File file) {
    return validateAgainstEdm(new javax.xml.transform.stream.StreamSource(file), true, true);
}