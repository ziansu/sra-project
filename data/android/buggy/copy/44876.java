@org.junit.Test(expected = java.lang.Exception.class)
public void testGetChunkCodeByLineException() throws java.lang.Exception {
    context.healthinformatics.sequentialdataanalysis.Connections c = new context.healthinformatics.sequentialdataanalysis.Connections(chunks);
    c.getChunkByLine((-1));
}