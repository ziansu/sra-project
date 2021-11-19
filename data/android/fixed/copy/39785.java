@java.lang.Override
public void initialize(org.apache.uima.UimaContext context) throws org.apache.uima.resource.ResourceInitializationException {
    super.initialize(context);
    try {
        lines = org.apache.commons.io.FileUtils.readLines(inputFile);
        currentLine = 1;
    } catch (java.io.IOException e) {
        throw new org.apache.uima.resource.ResourceInitializationException(e);
    }
}