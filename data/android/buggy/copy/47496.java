public java.lang.String getReasonForChange() {
    if (!(com.novartis.ecrs.ui.constants.ViewConstants.isNotEmpty(reasonForChange)))
        reasonForChange = com.novartis.ecrs.ui.constants.ViewConstants.REASON_DEFAULT_VALUE;
    
    return reasonForChange;
}