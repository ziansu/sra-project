@org.junit.Test
public void testGetChunkByLine() throws java.lang.Exception {
    context.healthinformatics.sequentialdataanalysis.Codes codes = new context.healthinformatics.sequentialdataanalysis.Codes(chunks);
    org.junit.Assert.assertEquals("CommentA", codes.getChunkByLine(1).getComment());
}