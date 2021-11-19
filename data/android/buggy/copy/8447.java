static boolean isDotCommaSeparatedNum(java.lang.String coveredText) {
    return de.unidue.ltl.toobee.feature.is.IsNumber.isPure(coveredText.replaceAll(",", "").replaceAll("\\.", ""));
}