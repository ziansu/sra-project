protected static java.util.List<uk.ac.ebi.pride.tools.xtandemtsvconverter.util.PSM> extractPsms(java.io.File inputFile) throws java.lang.Exception {
    uk.ac.ebi.pride.tools.xtandemtsvconverter.util.SimpleXTandemParser simpleXTandemParser = new uk.ac.ebi.pride.tools.xtandemtsvconverter.util.SimpleXTandemParser(inputFile);
    return new java.util.ArrayList<uk.ac.ebi.pride.tools.xtandemtsvconverter.util.PSM>(simpleXTandemParser.getPsms());
}