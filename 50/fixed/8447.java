static boolean isDotCommaSeparatedNum(java.lang.String coveredText) {
    java.lang.String value = coveredText.replaceAll(",", "").replaceAll("\\.", "");
    return (de.unidue.ltl.toobee.feature.is.IsNumber.isPure(value)) && (!(value.isEmpty()));
}