public void setTextInMask(java.lang.String text) {
    if (!(maskedFormatterAttached)) {
        safeSetText(text);
    }else {
        detachMaskedFormatter(false);
        safeSetText(maskedFormatter.getFormattedValue(text));
        attachMaskedFormatter();
    }
}