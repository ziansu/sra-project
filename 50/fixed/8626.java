public void setLabel(java.lang.String labelName) throws org.openlmis.requisition.exception.RequisitionTemplateColumnException {
    if (!(validateString(labelName))) {
        throw new org.openlmis.requisition.exception.RequisitionTemplateColumnException("Only alphanumeric label is accepted.");
    }
    this.label = labelName;
}