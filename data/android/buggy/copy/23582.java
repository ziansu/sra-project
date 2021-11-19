public boolean isValid() {
    org.opentravel.schemacompiler.validate.ValidationFindings findings = org.opentravel.schemacompiler.validate.compile.TLModelCompileValidator.validateModelElement(tlObj);
    return findings.isEmpty();
}