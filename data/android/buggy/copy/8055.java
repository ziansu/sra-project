public static boolean checkRegExp(java.lang.String identifier, java.lang.String datatype) {
    net.biomodels.miriam.Miriam.Datatype dt = org.biopax.paxtools.normalizer.MiriamLink.getDatatype(datatype);
    java.util.regex.Pattern pattern = java.util.regex.Pattern.compile(dt.getPattern());
    return pattern.matcher(identifier).find();
}